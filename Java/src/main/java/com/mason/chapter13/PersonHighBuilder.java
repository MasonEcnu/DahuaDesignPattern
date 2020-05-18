package com.mason.chapter13;

/**
 * Created by mwu on 2020/5/14
 */
public class PersonHighBuilder implements PersonBuilder {

    @Override
    public void buildLeg() {
        System.out.println("构建大长腿");
    }
}
