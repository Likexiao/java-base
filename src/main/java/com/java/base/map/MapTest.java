package com.java.base.map;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap hm = new HashMap<>();
        ConcurrentHashMap cache = new ConcurrentHashMap();

        for(int i=0;i<10000;i++) cache.put("k"+i,"v"+i);
        System.out.println(cache.get("k233"));
    }
}
