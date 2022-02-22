package com.java.base.fanxing;

public class Plate<T> {
    public Plate(T t) {
        this.t = t;
    }

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
