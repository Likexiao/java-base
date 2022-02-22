package com.java.base.runnable;

public class ThreadMain {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        t1.start();
    }
}
