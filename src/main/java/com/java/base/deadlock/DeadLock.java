package com.java.base.deadlock;

import cn.hutool.core.thread.ThreadException;

public class DeadLock implements Runnable{
    private static Object object1 = new Object();
    private static Object object2 = new Object();
    private boolean flag;
    DeadLock(boolean flag){
        this.flag = flag;
    }

    /**
     * 运行
     */
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "运行");
        if(flag){
            synchronized (object1){
                System.out.println(Thread.currentThread().getName() +" used object1");
                try {
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            synchronized (object2){
                System.out.println("5秒钟后，"+Thread.currentThread().getName()
                        + "锁住obj2");
            }
        }
        else {
            synchronized (object2){
                System.out.println(Thread.currentThread().getName() +" used object2");
                try {
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            synchronized (object1){
                System.out.println("5秒钟后，"+Thread.currentThread().getName()
                        + "锁住obj1");
            }
        }
    }
}
