package com.mason.chapter8.leifeng;

/**
 * Created by mwu on 2020/5/13
 */
public class Volunteer extends LeiFeng {

    @Override
    public void sweep() {
        System.out.println("志愿者打扫卫生");
    }

    @Override
    public void wash() {
        System.out.println("志愿者洗衣服");
    }

    @Override
    public void buyRice() {
        System.out.println("志愿者买米");
    }
}
