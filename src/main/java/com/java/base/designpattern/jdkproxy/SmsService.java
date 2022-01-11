package com.java.base.designpattern.jdkproxy;

public interface SmsService {
    String send(String message);
    String resend(String message);
}
