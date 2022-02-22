package com.java.base.fanxing;

public class Test {
    public static void main(String[] args) {
//        TODO: well done
//        FIXME: 还有bug
        Plate<? extends Fruit> plate = new Plate<>(new Apple());
        Apple apple = (Apple) plate.getT();
        apple.say();
    }
}
