package com.java.base.classes;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassReflect {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.java.base.classes.Person");
            Method p1Method = clazz.getMethod("setName", String.class);
            Constructor constructor = clazz.getConstructor(String.class,int.class);
            Constructor constructor1 = clazz.getConstructor();
            Person p1 = (Person) constructor.newInstance("lkx",24);
            Person p2 = (Person) constructor1.newInstance();
            p2.setName("lkx2");
            System.out.println(p1.getName());
            p1Method.invoke(p1,"lkxchanged");

            System.out.println(p1.getName());
            System.out.println(p2.getName());
            p1Method.invoke(p2,"lkx2 changed");
            System.out.println(p2.getName());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
