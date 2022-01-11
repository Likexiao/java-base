package com.java.base.redis;

import cn.hutool.core.util.ByteUtil;
import cn.hutool.json.JSONUtil;
import com.java.base.enity.User;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Map;

public class RedisTest {
    public static void main(String[] args) {
        Jedis jedis = RedisSingle.getRedis();
//        Map<String, String> map = new HashMap<String, String>();
//        for(int i=0;i<10000;i++){
//            map.put("big"+i,"BigValue"+i);
//        }
//        jedis.hmset("hmmap",map);

        List<String> result = jedis.hmget("hmmap","big1111","big1123");
        if (!result.isEmpty()){
            for(String s:result){
                System.out.println(s);
            }
        }else {
            System.out.println("kong");
        }

//        Map<String, User> map3 = new HashMap<String, User>();
//        map3.put("key1", new User("lkx",24,"pingxiang"));
//        map3.put("key2", new User("lkx",24,"pingxiang"));
//        map3.put("key3", new User("lkx",24,"pingxiang"));
//        jedis.set("hmuser".getBytes(), RedisSingle.serializable(map3));
        byte[] str = jedis.get("hmuser".getBytes());
        Map<String, User> map4 = (Map<String, User>) RedisSingle.unSerializable(str);

//        Iterator<Map.Entry<String,String>> iterable = map2.entrySet().iterator();
//        while (iterable.hasNext()){
//            Map.Entry<String,String> entry = iterable.next();
//            System.out.println("key:"+entry.getKey()+",value:"+entry.getValue());
//        }
    }
}
