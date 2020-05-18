package com.mason.chapter14.original;

/**
 * Created by mwu on 2020/5/15
 */
public class StockObserver extends Observer {

    public StockObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.format("%s %s 关闭股票行情，继续工作！\n", this.sub.getStatus(), this.name);
    }
}
