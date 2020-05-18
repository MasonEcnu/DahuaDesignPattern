package com.mason.chapter8.leifeng;

/**
 * Created by mwu on 2020/5/13
 */
public class TestLeifeng {

    public static void main(String[] args) {
        LeifengFactory factory = new VolunteerFactory();
        LeiFeng student = factory.createLeifeng();
        student.sweep();
        student.wash();
        student.buyRice();
    }
}
