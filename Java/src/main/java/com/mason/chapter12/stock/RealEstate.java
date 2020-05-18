package com.mason.chapter12.stock;

/**
 * Created by mwu on 2020/5/14
 */
public class RealEstate implements IStock {

    @Override
    public void buy() {
        System.out.println("买入房地产股");
    }

    @Override
    public void sell() {
        System.out.println("卖出房地产股");
    }
}
