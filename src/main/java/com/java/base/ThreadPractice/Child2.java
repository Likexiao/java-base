package com.java.base.ThreadPractice;

public class Child2 implements Runnable {

    @Override
    public void run() {
        while (true){
            synchronized (Kuang.kuangvalue){
                if (Kuang.kuangvalue.size() == 0) {
                    try {
                        Kuang.kuangvalue.wait();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                Kuang.kuangvalue.remove("apple");
                System.out.println(Thread.currentThread().getName()+" 孩子2吃了一个苹果，目前筐里还有" + Kuang.kuangvalue.size() + "个苹果");
                Kuang.kuangvalue.notify();
                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
