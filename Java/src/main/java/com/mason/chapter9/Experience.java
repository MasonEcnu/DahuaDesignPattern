package com.mason.chapter9;

/**
 * Created by mwu on 2020/5/13
 */
class Experience {
    public final String timeArea;
    public final String company;

    public Experience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    @Override
    public String toString() {
        return String.format("Experience:[timeArea:%s,company:%s]", timeArea, company);
    }
}
