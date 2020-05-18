package com.mason.chapter1;

/**
 * Created by mwu on 2020/5/9
 * 操作符抽象类
 */
public abstract class Operation {

    private double firstOperand = 0;
    private double secondOperand = 0;

    public abstract double getResult();

    public double getFirstOperand() {
        return firstOperand;
    }

    public void setFirstOperand(double firstOperand) {
        this.firstOperand = firstOperand;
    }

    public double getSecondOperand() {
        return secondOperand;
    }

    public void setSecondOperand(double secondOperand) {
        this.secondOperand = secondOperand;
    }
}
