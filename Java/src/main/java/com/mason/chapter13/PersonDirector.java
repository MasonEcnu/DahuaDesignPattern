package com.mason.chapter13;

/**
 * Created by mwu on 2020/5/14
 */
public class PersonDirector {

    private final PersonBuilder pb;

    public PersonDirector(PersonBuilder pb) {
        this.pb = pb;
    }

    public void createPerson() {
        System.out.println("构建新的小人儿--" + pb.getClass().getSimpleName());
        pb.buildHead();
        pb.buildBody();
        pb.buildArm();
        pb.buildLeg();
    }
}
