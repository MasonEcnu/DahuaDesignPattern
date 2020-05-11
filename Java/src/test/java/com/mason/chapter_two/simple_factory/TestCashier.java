package com.mason.chapter_two.simple_factory;

import com.mason.basic.Console;

/**
 * Created by mwu on 2020/5/9
 */
public class TestCashier {

    public static void main(String[] args) {
        Console console = new Console();
        String mode = console.readLine();
        double money = console.readDouble();
        Cashier cashier = CashierFactory.createCashier(mode);
        System.out.println(cashier.acceptCash(money));
        console.close();
    }
}
