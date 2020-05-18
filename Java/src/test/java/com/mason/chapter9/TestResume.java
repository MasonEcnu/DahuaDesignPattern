package com.mason.chapter9;

/**
 * Created by mwu on 2020/5/13
 */
public class TestResume {

    public static void main(String[] args) throws CloneNotSupportedException {
        Resume resume = new Resume("Mason");
        resume.setPersonalInfo("男", 22);
        resume.setWorkExperience("2000-2005", "嘿哈");
        resume.display();

        Resume resume1 = (Resume) resume.clone();
        resume1.setPersonalInfo("女", 20);
        resume1.setWorkExperience("2001-2005", "哈嘿");
        resume1.display();
    }
}
