package com.java.base.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        AllUser allUser = AllUserSingleton.getAllUserSingleton();
        allUser.setAll_num(300);

        AllUser seted = AllUserSingleton.getAllUserSingleton();
        System.out.println(seted.getAll_num());
        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            System.out.println("钩子钩子");
        }));
    }
}
