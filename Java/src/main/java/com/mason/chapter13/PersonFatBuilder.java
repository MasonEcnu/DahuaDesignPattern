package com.mason.chapter13;

/**
 * Created by mwu on 2020/5/14
 */
public class PersonFatBuilder implements PersonBuilder {

    @Override
    public void buildBody() {
        System.out.println("构建胖胖的身体");
    }
}
