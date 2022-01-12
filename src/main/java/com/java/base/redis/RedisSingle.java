package com.java.base.redis;

import lombok.Synchronized;
import redis.clients.jedis.Jedis;

import java.io.*;

public class RedisSingle {
    private static Jedis jedis;
    private static String url = "127.0.0.1";
    private static int port = 6379;
    /**
     * 能复述
     *
     * @return {@link Jedis}
     */
    public static Jedis getRedis(){
         if (jedis == null){

              jedis = new Jedis(url,port);
              jedis.select(1);
             System.out.println("创建成功，获取到Redis单例");
         }
         else {
             System.out.println("连接成功，获取到Redis单例");
         }
        return jedis;
    }

    /**
     * 可序列化
     *
     * @param object 对象
     * @return {@link byte[]}
     */
    public static byte[] serializable(Object object) throws IOException {
        ObjectOutputStream oos =null;
        ByteArrayOutputStream bos = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(object);
            byte[] result = bos.toByteArray();
            return result;
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            bos.close();
            oos.close();
        }
        return null;
    }
    public static Object unSerializable(byte[] bytes) throws IOException {
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bis = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(bis);

            Object result = ois.readObject();

            return  result;


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            bis.close();
            ois.close();
        }
            return null;
    }
}
