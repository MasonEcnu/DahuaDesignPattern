package com.mason.chapter1;

/**
 * Created by mwu on 2020/5/13
 */
public class OperationMulti extends Operation {

    @Override
    public double getResult() {
        return getFirstOperand() * getSecondOperand();
    }
}
