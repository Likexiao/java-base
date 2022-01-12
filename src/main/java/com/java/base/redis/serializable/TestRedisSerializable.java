package com.java.base.redis.serializable;

import cn.hutool.core.io.IoUtil;
import com.java.base.enity.User;
import com.java.base.redis.RedisSingle;
import redis.clients.jedis.Jedis;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 测试,Redis序列化
 *
 * @author lkx
 * @date 2022/01/11
 */
public class TestRedisSerializable {
    public static void main(String[] args) {
        Jedis jedis = RedisSingle.getRedis();

        Map<String, User> hmmap = new HashMap<String, User>();
        hmmap.put("key1", new User("lkx",24,"pingxiang"));
        hmmap.put("key2", new User("lkx",24,"pingxiang"));
        hmmap.put("key3", new User("lkx",24,"pingxiang"));
        try {
            jedis.set("hmserializable".getBytes(), RedisSingle.serializable(hmmap));
        }catch (IOException e){
            e.printStackTrace();
        }



        byte[] str = jedis.get("hmserializable".getBytes());
//        Map<String, User> map4 = (Map<String, User>) RedisSingle.unSerializable(str);
        Map<String, User> map4 = (Map<String, User>) IoUtil.readObj(new ByteArrayInputStream(str));

        if (map4 == null){
            System.out.println("map为空");
            return;
        }
        Set<Map.Entry<String,User>> entrySet = map4.entrySet();
        for(Map.Entry<String,User> entry : entrySet){
            System.out.println("key: "+entry.getKey());
            System.out.println("value: "+entry.getValue());
        }
    }
}
