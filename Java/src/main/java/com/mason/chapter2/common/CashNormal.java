package com.mason.chapter2.common;

/**
 * Created by mwu on 2020/5/11
 */
public class CashNormal extends Cashier {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
