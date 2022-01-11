package com.java.base.redis;

import redis.clients.jedis.Jedis;

/**
 * The type Redis factory.
 * This is a
 * @author likexiao
 * @version 1.0
 *
 */
public class RedisFactory {
    /**
     * The constant redis.
     */
    public static Jedis redis = null;
    /**
     * The constant url.
     */
    public static final String url = "127.0.0.1";
    /**
     * The constant port.
     */
    public static final int port = 6379;

    /**
     * Get redis jedis.
     *
     * @return the jedis
     */
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
