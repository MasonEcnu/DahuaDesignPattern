package com.mason.chapter7.no_proxy;

import com.mason.chapter7.Girl;

/**
 * Created by mwu on 2020/5/13
 */
public class TestPursuit {

    public static void main(String[] args) {
        Girl mm = new Girl("mm");
        Pursuit xx = new Pursuit(mm);
        xx.giveDolls();
        xx.giveFlowers();
        xx.giveChocolate();
    }
}
