package com.java.base.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyMain {
    public static void main(String[] args) {
        Run run = new RunImpl();
        Run runproxy = (Run) Proxy.newProxyInstance(new RunImpl().getClass().getClassLoader(), new RunImpl().getClass().getInterfaces(),new LogInterceptor());
        runproxy.go();

    }
}
