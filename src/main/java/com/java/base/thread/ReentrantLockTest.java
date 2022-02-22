package com.java.base.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest implements Runnable{
    private static final Lock lock = new ReentrantLock();
    private static int sign = 1;

    @Override
    public void run() {
        lock.lock();
        System.out.println(Thread.currentThread().getName()+"拿了锁");
        try {
            System.out.println("sign : "+sign);

            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            sign = 20;
            System.out.println(Thread.currentThread().getName()+"释放了锁");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new ReentrantLockTest());
        Thread thread2 = new Thread(new ReentrantLockTest());
        thread1.start();
        thread2.start();

    }
}
