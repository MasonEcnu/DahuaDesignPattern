package com.mason.chapter10;

/**
 * Created by mwu on 2020/5/14
 * <p>
 * 试卷超类
 * 模板方法中的模板
 * java8新特性：default方法
 * <p>
 * 这样做的话，试卷就只有一份，实现试卷模板的学生，只需要答题即可
 */
public interface TestPaper {

    default void questionOne() {
        System.out.println("第一道题，答案：" + answerOne());
    }

    default void questionTwo() {
        System.out.println("第二道题，答案：" + answerTwo());
    }

    default void questionThree() {
        System.out.println("第三道题，答案：" + answerThree());
    }

    String answerOne();

    String answerTwo();

    String answerThree();
}
