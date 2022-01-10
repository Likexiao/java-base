package com.javabase.redis;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;

public class RedisMain {
    public static void main(String[] args) {
        Jedis jedis = RedisFactory.getRedis();
        List<String> hashMap = jedis.hmget("hashhh","hh");
        for (String str:
             hashMap) {
            System.out.println(str);
        }
        String str = jedis.get("str");
        System.out.println(str);
    }
}
