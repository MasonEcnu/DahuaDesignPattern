package com.mason.chapter12;

/**
 * Created by mwu on 2020/5/14
 */
public class TestStockFacade {

    public static void main(String[] args) {
        StockFacade facade = new StockFacade();
        facade.buyHighTech();
        facade.buyTraditional();
        facade.buyAll();
        facade.sellAll();
    }
}
