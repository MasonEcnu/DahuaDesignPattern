package com.mason.chapter7.reality;

import com.mason.chapter7.Girl;

/**
 * Created by mwu on 2020/5/13
 */
class PursuitProxy implements IGiveGift {

    private final Pursuit pursuit;

    public PursuitProxy(Girl girl) {
        this.pursuit = new Pursuit(girl);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();

    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
