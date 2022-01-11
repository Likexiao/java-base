package com.java.base.ThreadPractice;

public class FarmerChild {
    public static void main(String[] args) {
        new Farmer().start();
        Thread thread = new Thread(new Child2());
        thread.start();
        new Child().start();


    }
}
