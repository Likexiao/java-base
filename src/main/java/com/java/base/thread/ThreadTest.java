package com.java.base.thread;

public class ThreadTest {
    public static void main(String[] args) {
        final Counter counter = new Counter();
        for (int i = 0; i < 100; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    counter.run();
                }
            }).start();
        }
        System.out.println(counter);

    }
}
