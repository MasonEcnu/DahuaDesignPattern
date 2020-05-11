package com.mason.basic;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by mwu on 2020/5/12
 * 输入工具类
 * todo 注意释放Scanner
 */
public class Console {

    private static Scanner scanner;

    public Console() {
        scanner = new Scanner(System.in);
    }

    public String readLine() {
        System.out.println("请输入string值：");
        return scanner.nextLine();
    }

    public int readInt() {
        System.out.println("请输入int值：");
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("输入错误，请重新输入：");
                scanner.nextLine();
            }
        }
    }

    public boolean readBoolean() {
        System.out.println("请输入boolean值：");
        while (true) {
            try {
                return scanner.nextBoolean();
            } catch (InputMismatchException e) {
                System.out.println("输入错误，请重新输入：");
                scanner.nextLine();
            }
        }
    }

    public double readDouble() {
        System.out.println("请输入double值：");
        while (true) {
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("输入错误，请重新输入：");
                scanner.nextLine();
            }
        }
    }

    public void close() {
        scanner.close();
    }

    public static void main(String[] args) {
        Console console = new Console();
        System.out.println(console.readLine());
        System.out.println(console.readInt());
        System.out.println(console.readBoolean());
        console.close();
    }
}
