package com.mason.chapter1;

/**
 * Created by mwu on 2020/5/9
 */
public class OperateFactory {

    public static Operation createOperation(String operate) {
        Operation operation;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMulti();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                throw new IllegalArgumentException("operate:" + operate);
        }
        return operation;
    }

    public static Operation createOperation(String operate, int digit) {
        Operation operation = createOperation(operate);
        return new OperationIntegrate(operation, digit);
    }
}
