package com.java.base.redis;


import com.java.base.enity.User;
import redis.clients.jedis.Jedis;

import java.util.Map;

/**
 * 测试
 *
 * @author lkx
 * @date 2022/01/11
 */
public class RedisTest {
    public static void main(String[] args) {
        Jedis jedis = RedisSingle.getRedis();

        jedis.set("test","testfeild");


    }
}
