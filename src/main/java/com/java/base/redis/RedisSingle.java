package com.java.base.redis;

import lombok.Synchronized;
import redis.clients.jedis.Jedis;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class RedisSingle {
    private static Jedis jedis;
     public static Jedis getRedis(){
         if (jedis == null){
              jedis = new Jedis("127.0.0.1",6379);
             System.out.println("创建成功，获取到Redis单例");
         }
         else {
             System.out.println("连接成功，获取到Redis单例");
         }
        return jedis;
    }
    public static byte[] serializable(Object object){
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
        }
        return null;
    }
    public static Object unSerializable(byte[] bytes){
        ByteArrayInputStream bis;
        ObjectInputStream ois;
        try {
            bis = new ByteArrayInputStream(bytes);
            ois = new ObjectInputStream(bis);

            Object result = ois.readObject();
            return  result;
        }catch (Exception e){
            e.printStackTrace();
        }
            return null;
    }
}
