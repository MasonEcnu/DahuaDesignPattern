package com.mason.chapter9;

/**
 * Created by mwu on 2020/5/13
 */
class Resume implements Cloneable {

    public final String name;
    private String sex;
    private int age;
    private Experience experience;

    public Resume(String name) {
        this.name = name;
    }

    public void setPersonalInfo(String sex, int age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company) {
        this.experience = new Experience(timeArea, company);
    }

    @Override
    public String toString() {
        return String.format("Resume[name:%s,sex:%s,age:%s,%s]", name, sex, age, experience);
    }

    public void display() {
        System.out.println(toString());
    }

    // 动态地获得对象运行时的状态
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
