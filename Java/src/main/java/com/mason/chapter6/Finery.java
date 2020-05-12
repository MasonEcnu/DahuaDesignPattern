package com.mason.chapter6;

/**
 * Created by mwu on 2020/5/12
 */
public class Finery extends Person {

    private Person component;

    public void decorate(Person component) {
        this.component = component;
    }

    @Override
    public void show() {
        if (this.component != null) {
            this.component.show();
        }
    }
}
