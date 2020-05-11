package com.mason.chapter_two.simple_factory;

/**
 * Created by mwu on 2020/5/9
 */
public abstract class Cashier {
    abstract double acceptCash(double money);
}

class CashNormal extends Cashier {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}

class CashRebate extends Cashier {

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

class CashReturn extends Cashier {

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