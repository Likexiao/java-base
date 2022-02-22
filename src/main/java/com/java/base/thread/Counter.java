package com.java.base.thread;

public class Counter {

    public static int count = 0;

    public synchronized void inc() {
        count++;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                inc();// n=count+1改成了inc()
                Thread.sleep(3);// 为了使运行结果更随即，延迟3毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return "[count=" + count + "]";
    }
}