package com.mason.chapter2.common;

/**
 * Created by mwu on 2020/5/11
 */
public class CashRebate extends Cashier {

    private final double moneyRebate;

    public CashRebate(double moneyRebate) {
        if (moneyRebate > 1.0) {
            throw new IllegalArgumentException("moneyRebate:" + moneyRebate);
        }
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
