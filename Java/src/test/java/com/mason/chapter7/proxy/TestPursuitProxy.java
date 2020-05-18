package com.mason.chapter7.proxy;

import com.mason.chapter7.Girl;

/**
 * Created by mwu on 2020/5/13
 */
public class TestPursuitProxy {

    public static void main(String[] args) {
        Girl mm = new Girl("mm");
        PursuitProxy xx = new PursuitProxy(mm);
        xx.giveDolls();
        xx.giveFlowers();
        xx.giveChocolate();
    }
}
