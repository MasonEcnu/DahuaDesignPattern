package com.mason.chapter10;

/**
 * Created by mwu on 2020/5/14
 */
public class StudentPaperA implements TestPaper {

    @Override
    public String answerOne() {
        return "A";
    }

    @Override
    public String answerTwo() {
        return "B";
    }

    @Override
    public String answerThree() {
        return "C";
    }
}
