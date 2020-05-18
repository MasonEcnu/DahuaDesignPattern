package com.mason.chapter7.reality;

import com.mason.chapter7.Girl;

/**
 * Created by mwu on 2020/5/13
 */
public class TestReality {

    public static void main(String[] args) {
        Girl girl = new Girl("mm");
        PursuitProxy proxy = new PursuitProxy(girl);
        proxy.giveDolls();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
