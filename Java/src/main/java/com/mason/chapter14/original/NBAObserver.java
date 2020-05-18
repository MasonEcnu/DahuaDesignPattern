package com.mason.chapter14.original;

/**
 * Created by mwu on 2020/5/15
 */
public class NBAObserver extends Observer {

    public NBAObserver(String name, Subject sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.format("%s %s 关闭NBA实况，继续工作！\n", this.sub.getStatus(), this.name);
    }
}
