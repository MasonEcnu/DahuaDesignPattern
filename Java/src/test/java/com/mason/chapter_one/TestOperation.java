package com.mason.chapter_one;

import com.mason.basic.Console;

/**
 * Created by mwu on 2020/5/9
 */
public class TestOperation {

    public static void main(String[] args) {
        Console console = new Console();
        String operate = console.readLine();
        Operation operation = OperateFactory.createOperation(operate);
        operation.setFirstOperand(console.readDouble());
        operation.setSecondOperand(console.readDouble());
        System.out.println(operation.getResult());
        console.close();
    }
}
