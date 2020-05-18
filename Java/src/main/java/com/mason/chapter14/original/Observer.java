package com.mason.chapter14.original;

/**
 * Created by mwu on 2020/5/15
 */
public abstract class Observer {

    public abstract void update();

    public String name;
    public Subject sub;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }
}
