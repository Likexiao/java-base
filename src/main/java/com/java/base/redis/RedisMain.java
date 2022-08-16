package com.java.base.redis;

import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RedisMain {
    public static void main(String[] args) {
        Jedis jedis = RedisFactory.getRedis();
        Map<String, String> u1001 = new HashMap<>();
        u1001.put("name","likexiao");
        u1001.put("age","123");
        u1001.put("adress","江西省萍乡市芦溪县");
        jedis.hmset("10001",u1001);

        List<String> u_10001 = jedis.hmget("10002","name","adress","age");
         System.out.println(u_10001.isEmpty());
//        u_10001.forEach(u10001 -> {
//            System.out.println(u10001);
//        });
//        if (u_10001 == null){
//            System.out.println("获取为空");
//        }else {
//            Iterator<String> iterator = u_10001.iterator();
//            while (iterator.hasNext()) System.out.println(iterator.next());
//        }

        jedis.close();
    }
}
