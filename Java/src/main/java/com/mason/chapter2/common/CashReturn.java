package com.mason.chapter2.common;

/**
 * Created by mwu on 2020/5/11
 */
public class CashReturn extends Cashier {

    private final double moneyCondition;
    private final double moneyReturn;

    public CashReturn(double moneyCondition, double moneyReturn) {
        if (moneyReturn > moneyCondition) {
            throw new IllegalArgumentException("moneyReturn:" + moneyReturn + ", moneyCondition:" + moneyCondition);
        }
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        if (money >= moneyCondition) {
            return money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return money;
    }
}
