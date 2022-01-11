package com.java.base.ThreadPractice;

public class Farmer extends Thread{
    public void run() {
        while (true){
            synchronized (Kuang.kuangvalue){
                if (Kuang.kuangvalue.size() == 10) {
                    try {
                        Kuang.kuangvalue.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                    Kuang.kuangvalue.add("apple");
                    System.out.println(Thread.currentThread().getName()+" 农夫放了一个苹果，目前筐里还有" + Kuang.kuangvalue.size() + "个苹果");
                    Kuang.kuangvalue.notify();
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
            }
        }
    }
}
