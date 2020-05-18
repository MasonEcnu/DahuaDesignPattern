package com.mason.chapter7.no_proxy;

import com.mason.chapter7.Girl;

/**
 * Created by mwu on 2020/5/13
 */
class Pursuit {

    private final Girl girl;

    Pursuit(Girl girl) {
        this.girl = girl;
    }

    public void giveDolls() {
        System.out.println(girl.name + " 送你洋娃娃");
    }

    public void giveFlowers() {
        System.out.println(girl.name + " 送你鲜花");
    }

    public void giveChocolate() {
        System.out.println(girl.name + " 送你巧克力");
    }
}
