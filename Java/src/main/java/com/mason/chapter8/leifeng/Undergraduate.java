package com.mason.chapter8.leifeng;

/**
 * Created by mwu on 2020/5/13
 */
public class Undergraduate extends LeiFeng {

    @Override
    public void sweep() {
        System.out.println("在校学生打扫卫生");
    }

    @Override
    public void wash() {
        System.out.println("在校学生洗衣服");
    }

    @Override
    public void buyRice() {
        System.out.println("在校学生买米");
    }
}
