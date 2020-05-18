package com.mason.chapter8.calculator;

import com.mason.chapter1.Operation;
import com.mason.chapter1.OperationDiv;

/**
 * Created by mwu on 2020/5/13
 */
public class DivFactory implements CalcFactory {

    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
