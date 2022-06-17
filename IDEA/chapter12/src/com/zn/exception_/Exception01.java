package com.zn.exception_;

import java.util.Scanner;

public class Exception01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        String inputStr;
        while (true) {
            System.out.println("输入一个整数");
            inputStr = scanner.next();
            try {
                number = Integer.parseInt(inputStr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入的不是整数");
            }
        }
        System.out.println(number);
    }
}
