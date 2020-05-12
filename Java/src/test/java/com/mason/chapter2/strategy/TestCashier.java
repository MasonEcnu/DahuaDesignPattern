package com.mason.chapter2.strategy;

import com.mason.basic.Console;

/**
 * Created by mwu on 2020/5/9
 */
public class TestCashier {

    public static void main(String[] args) {
        Console console = new Console();
        String mode = console.readLine();
        double money = console.readDouble();
        CashierContext context = new CashierContext(mode);
        System.out.println(context.getResult(money));
        console.close();
    }
}
