package com.mason.chapter6;

/**
 * Created by mwu on 2020/5/12
 */
public class Person {

    private final String name;

    public Person() {
        this.name = "";
    }

    public Person(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("装扮的" + name);
    }
}
