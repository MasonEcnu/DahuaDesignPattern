package com.mason.chapter1;

import java.math.BigDecimal;

/**
 * Created by mwu on 2020/5/9
 * 操作符抽象类
 */
public abstract class Operation {

    private double firstOperand = 0;
    private double secondOperand = 0;

    abstract double getResult();

    public double getFirstOperand() {
        return firstOperand;
    }

    public double getSecondOperand() {
        return secondOperand;
    }

    public void setFirstOperand(double firstOperand) {
        this.firstOperand = firstOperand;
    }

    public void setSecondOperand(double secondOperand) {
        this.secondOperand = secondOperand;
    }
}

class OperationAdd extends Operation {

    @Override
    double getResult() {
        return getFirstOperand() + getSecondOperand();
    }
}

class OperationSub extends Operation {

    @Override
    double getResult() {
        return getFirstOperand() - getSecondOperand();
    }
}

class OperationMulti extends Operation {

    @Override
    double getResult() {
        return getFirstOperand() * getSecondOperand();
    }
}

class OperationDiv extends Operation {

    @Override
    double getResult() {
        if (getSecondOperand() == 0) {
            throw new IllegalArgumentException("div 0");
        }
        return getFirstOperand() / getSecondOperand();
    }
}

class OperationIntegrate extends Operation {

    private final Operation operation;
    private final int digit;

    public OperationIntegrate(Operation operation, int digit) {
        this.operation = operation;
        this.digit = digit;
    }

    @Override
    double getResult() {
        BigDecimal b = BigDecimal.valueOf(operation.getResult());
        /*setScale 第一个参数为保留位数 第二个参数为舍入机制
         BigDecimal.ROUND_DOWN 表示不进位
         BigDecimal.ROUND_UP表示进位*/
        return b.setScale(digit, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    @Override
    public void setFirstOperand(double firstOperand) {
        this.operation.setFirstOperand(firstOperand);
    }

    @Override
    public void setSecondOperand(double secondOperand) {
        this.operation.setSecondOperand(secondOperand);
    }
}
