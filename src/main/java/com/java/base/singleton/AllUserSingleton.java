package com.java.base.singleton;

public class AllUserSingleton {
    private static volatile AllUser allUser;
    public static AllUser getAllUserSingleton(){
        if (allUser == null){
            synchronized(AllUser.class){
                if (allUser == null){
                    allUser = new AllUser();
                }
            }
        }
        return allUser;
    }
}
