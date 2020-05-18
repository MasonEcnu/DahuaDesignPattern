package com.mason.chapter13;

/**
 * Created by mwu on 2020/5/14
 */
public interface PersonBuilder {

    default void buildHead() {
        System.out.println("构建头");
    }

    default void buildLeg() {
        System.out.println("构建双腿");

    }

    default void buildArm() {
        System.out.println("构建胳膊");
    }

    default void buildBody() {
        System.out.println("构建身体");
    }
}
