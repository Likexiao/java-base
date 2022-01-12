package com.java.base.redis.serializable;

import cn.hutool.core.io.IoUtil;
import com.java.base.enity.User;
import com.java.base.redis.RedisSingle;
import redis.clients.jedis.Jedis;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
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
    public static void main(String[] args) throws IOException {
        Jedis jedis = RedisSingle.getRedis();

        Map<String, User> hmmap = new HashMap<String, User>();
        hmmap.put("key1", new User("lkx",24,"pingxiang"));
        hmmap.put("key2", new User("lkx",24,"pingxiang"));
        hmmap.put("key3", new User("lkx",24,"pingxiang"));

        jedis.set("hmuser".getBytes(),RedisSingle.serializable(hmmap));
    }
}
