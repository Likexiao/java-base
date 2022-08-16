package com.java.base.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Test1 {
    @MyAnnotation("lkx")
    public void test(){
        System.out.println("test method");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Test1 test1 = new Test1();
        test1.test();
        Class clazz = test1.getClass();
        Method method = clazz.getMethod("test");
        boolean bbb = method.isAnnotationPresent(MyAnnotation.class);
        if(bbb){

            System.out.println("true");
        }
        MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
        System.out.println(myAnnotation.value());
    }
}
