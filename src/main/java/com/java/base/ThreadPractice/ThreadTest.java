package com.java.base.ThreadPractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {
    public static void main(String[] args) {
        Account account = new Account();

         AccountThread thread = new AccountThread(account,10.0);
         thread.run();

        System.out.println(account.getBalance());
    }
}
