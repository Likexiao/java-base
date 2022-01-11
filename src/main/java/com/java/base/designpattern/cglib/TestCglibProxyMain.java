package com.java.base.designpattern.cglib;

public class TestCglibProxyMain {
    public static void main(String[] args) {
        AliSmsService aliSmsService = (AliSmsService) CglibProxyFactory.getProxy(AliSmsService.class);
    aliSmsService.send("123");
    }
}
