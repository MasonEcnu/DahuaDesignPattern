package com.mason.chapter8.leifeng;

/**
 * Created by mwu on 2020/5/13
 */
public class UndergraduateFactory implements LeifengFactory {

    @Override
    public LeiFeng createLeifeng() {
        return new Undergraduate();
    }
}
