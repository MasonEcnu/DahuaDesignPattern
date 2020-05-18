package com.mason.chapter8.calculator;

import com.mason.basic.Console;
import com.mason.chapter1.Operation;

/**
 * Created by mwu on 2020/5/13
 */
public class TestCalculator {

    public static void main(String[] args) {
        Console console = new Console();
        CalcFactory calcFactory = new AddFactory();
        Operation operation = calcFactory.createOperation();
        operation.setFirstOperand(console.readDouble());
        operation.setSecondOperand(console.readDouble());
        System.out.println(operation.getResult());
        console.close();
    }
}
