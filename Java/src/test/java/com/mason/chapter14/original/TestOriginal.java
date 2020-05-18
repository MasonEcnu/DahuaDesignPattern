package com.mason.chapter14.original;

/**
 * Created by mwu on 2020/5/15
 */
public class TestOriginal {

    public static void main(String[] args) {
        Boss boss = new Boss("我胡汉三又回来了，");
        // 看股票同事
        StockObserver stockObserver = new StockObserver("嘿哈", boss);
        // 看NBA同事
        NBAObserver nbaObserver = new NBAObserver("哈嘿", boss);

        boss.attach(stockObserver);
        boss.attach(nbaObserver);

        boss.detach(stockObserver);
        // 通知
        boss.notice();
    }
}
