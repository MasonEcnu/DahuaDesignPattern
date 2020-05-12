package com.mason.chapter2.simple_factory;

import com.mason.basic.Console;
import com.mason.chapter2.common.Cashier;

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
