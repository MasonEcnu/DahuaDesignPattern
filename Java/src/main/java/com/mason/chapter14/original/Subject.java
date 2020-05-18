package com.mason.chapter14.original;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mwu on 2020/5/15
 * 主题
 */
abstract class Subject {

    private final List<Observer> observers = new ArrayList<>();

    private String status = "";

    void attach(Observer observer) {
        observers.add(observer);
    }

    void detach(Observer observer) {
        observers.remove(observer);
    }

    void notice() {
        observers.forEach(Observer::update);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
