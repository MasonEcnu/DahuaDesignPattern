package com.mason.chapter13;

/**
 * Created by mwu on 2020/5/14
 */
public class TestPersonBuilder {

    public static void main(String[] args) {
        PersonBuilder fatBuilder = new PersonFatBuilder();
        PersonDirector director = new PersonDirector(fatBuilder);
        director.createPerson();

        PersonBuilder highBuilder = new PersonHighBuilder();
        director = new PersonDirector(highBuilder);
        director.createPerson();
    }
}
