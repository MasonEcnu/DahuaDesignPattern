package com.mason.chapter7.reality;

import com.mason.chapter7.Girl;

/**
 * Created by mwu on 2020/5/13
 */
class Pursuit implements IGiveGift {

    private final Girl girl;

    Pursuit(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void giveDolls() {
        System.out.println(girl.name + " 送你洋娃娃");
    }

    @Override
    public void giveFlowers() {
        System.out.println(girl.name + " 送你鲜花");
    }

    @Override
    public void giveChocolate() {
        System.out.println(girl.name + " 送你巧克力");
    }
}
