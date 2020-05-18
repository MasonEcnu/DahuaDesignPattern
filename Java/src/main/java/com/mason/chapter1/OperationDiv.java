package com.mason.chapter1;

/**
 * Created by mwu on 2020/5/13
 */
public class OperationDiv extends Operation {

    @Override
    public double getResult() {
        if (getSecondOperand() == 0) {
            throw new IllegalArgumentException("div 0");
        }
        return getFirstOperand() / getSecondOperand();
    }
}