package com.java.base.singleton;

public class Singleton {
    private static volatile Singleton singleton;
    public Singleton(){}
    public static Singleton getSingleton(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
