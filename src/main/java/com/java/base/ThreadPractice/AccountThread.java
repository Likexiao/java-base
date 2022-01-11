package com.java.base.ThreadPractice;

public class AccountThread implements Runnable{
    private Account account;
    private double money;

    AccountThread(Account account,double money){
        this.account = account;
        this.money = money;
    }
    @Override
    public void run() {
        synchronized (account){
            account.deposit(money);
        }
    }
}
