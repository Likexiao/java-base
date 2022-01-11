package com.java.base.singleton;

public class AllUser {
    private static int all_num=10;//defeat


    public  int getAll_num() {
        return all_num;
    }

    public  void setAll_num(int all_num) {
        AllUser.all_num = all_num;
    }
}
