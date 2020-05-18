package com.mason.chapter13;

/**
 * Created by mwu on 2020/5/14
 */
public class PersonThinBuilder implements PersonBuilder {

    @Override
    public void buildBody() {
        System.out.println("构建瘦瘦的身体");
    }
}
