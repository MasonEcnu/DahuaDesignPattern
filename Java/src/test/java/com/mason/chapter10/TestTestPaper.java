package com.mason.chapter10;

/**
 * Created by mwu on 2020/5/14
 */
public class TestTestPaper {

    public static void main(String[] args) {
        System.out.println("学生A抄的试卷");
        TestPaper studentA = new StudentPaperA();
        studentA.questionOne();
        studentA.questionTwo();
        studentA.questionThree();

        System.out.println("学生B抄的试卷");
        TestPaper studentB = new StudentPaperB();
        studentB.questionOne();
        studentB.questionTwo();
        studentB.questionThree();
    }
}
