package com.javabase.redis;

import redis.clients.jedis.Jedis;

/**
 * @ClassName: RedisFactory
 * @Description: 获取Jedis实例
 * @Author
 * @Date 2022/1/8
 * @Version 1.0
 */
public class RedisFactory {
    public static Jedis redis = null;
    public static final String url = "127.0.0.1";
    public static final int port = 6379;
    public static Jedis getRedis(){
        if (redis == null){
            try {
                redis = new Jedis(url,port);
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("创建jedis失败");
            }
        }
        else return redis;
        return redis;
    }
}
