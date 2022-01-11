package com.java.base.designpattern.jdkproxy;

public class ProxyMain {
    public static void main(String[] args) {
        SmsService smsService = (SmsService) JdkProxyFactory.getProxy(new SmsServiceImpl());
        smsService.send("java");
        smsService.resend("smsService");
        System.out.println("123"+smsService.resend("123"));
    }
}
