package com.java.base.designpattern.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

public class TestMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib before method " + method.getName());
        Object object = methodProxy.invokeSuper(o,objects);
        System.out.println("cglib after method " + method.getName());
        return object;
    }
}
