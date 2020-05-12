package com.mason.chapter2.strategy;

import com.mason.chapter2.common.CashNormal;
import com.mason.chapter2.common.CashRebate;
import com.mason.chapter2.common.CashReturn;
import com.mason.chapter2.common.Cashier;

/**
 * Created by mwu on 2020/5/11
 */
public class CashierContext {

    private Cashier cashier = null;

    public CashierContext(String mode) {
        switch (mode) {
            case "正常收费":
                cashier = new CashNormal();
                break;
            case "打八折":
                cashier = new CashRebate(0.8);
                break;
            case "满300-100":
                cashier = new CashReturn(300, 100);
                break;
            case "":
                break;
            default:
                throw new IllegalArgumentException("mode:" + mode);
        }
    }

    public double getResult(double money) {
        return cashier.acceptCash(money);
    }

    public static void main(String[] args) {
        System.out.println(CashReturn.class.getName());
    }
}
