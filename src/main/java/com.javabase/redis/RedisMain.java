package com.javabase.redis;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.List;

/**
 * @ClassName: RedisMain
 * @Description:
 * @Author
 * @Date 2022/1/8
 * @Version 1.0
 */
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
