package com.java.base.deadlock;

public class DeadLockMain {
    public static void main(String[] args) {
        Thread thread1= new Thread(new DeadLock(true));
        Thread thread2= new Thread(new DeadLock(false));

        thread1.start();
        thread2.start();
    }
}
