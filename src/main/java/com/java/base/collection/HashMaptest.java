package com.java.base.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class HashMaptest {
    public static void main(String[] args) {
        HashSet  hashSet = new HashSet();
        try {
            hashSet.add("1");
            hashSet.add("2");
            hashSet.add("3");
            hashSet.add("4");
            hashSet.add("5");
            hashSet.add("6");

        }catch (Exception e){
            e.printStackTrace();

        }



        for (Object x:hashSet){
            System.out.println(x.toString());
        }

    }
}
