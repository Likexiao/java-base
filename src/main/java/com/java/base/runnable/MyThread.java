package com.java.base.runnable;

import lombok.Data;

import java.sql.SQLOutput;
import java.util.Date;
public class MyThread implements Runnable{
    private String message;
    MyThread(){
        message = "defeat message : good night";
    }
    MyThread(String message){
        this.message = message;
    }
    public void stop5second(){
        try {
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }finally {
            message = "finally edit success";
        }
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"Start time:"+new Date());
        stop5second();
        System.out.println(message);
        System.out.println(Thread.currentThread().getName()+"End time:"+new Date());
    }
}
