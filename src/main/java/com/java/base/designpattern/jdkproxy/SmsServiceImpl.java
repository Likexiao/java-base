package com.java.base.designpattern.jdkproxy;

public class SmsServiceImpl implements SmsService{

    @Override
    public String send(String message) {
        System.out.println("send message "+message);
        return message;
    }

    @Override
    public String resend(String message) {
        System.out.println("send message "+message);
        return message;
    }

}
