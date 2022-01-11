package com.java.base.ThreadPractice;

public class Account {

    private double balance=0.0;

    public synchronized void deposit(double money){
        double new_money = balance + money;
        try {
            Thread.sleep(10);
        }catch (Exception e){
            e.printStackTrace();
        }
        this.balance = new_money;
    }
    public double getBalance() {
        return balance;
    }
}
