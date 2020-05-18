package com.mason.chapter1;

import java.math.BigDecimal;

/**
 * Created by mwu on 2020/5/13
 */
public class OperationIntegrate extends Operation {

    private final Operation operation;
    private final int digit;

    public OperationIntegrate(Operation operation, int digit) {
        this.operation = operation;
        this.digit = digit;
    }

    @Override
    public double getResult() {
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
