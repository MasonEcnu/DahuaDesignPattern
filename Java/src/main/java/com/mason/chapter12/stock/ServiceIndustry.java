package com.mason.chapter12.stock;

/**
 * Created by mwu on 2020/5/14
 */
public class ServiceIndustry implements IStock {

    @Override
    public void buy() {
        System.out.println("买入服务业股");
    }

    @Override
    public void sell() {
        System.out.println("卖出服务业股");
    }
}
