package com.java.base.sheji.observation;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
