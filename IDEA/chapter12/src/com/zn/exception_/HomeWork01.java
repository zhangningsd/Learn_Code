package com.zn.exception_;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        String inputStr;
        int n1 = 0;
        int n2 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入被除数:");
        while (true){
            try {
                inputStr = scanner.next();
                n1 = Integer.parseInt(inputStr);
                break;
            } catch (NumberFormatException e) {
                System.out.print("请输入整数:");
            }
        }

        System.out.print("输入除数:");
        while (true) {
            try {
                inputStr = scanner.next();
                n2 = Integer.parseInt(inputStr);
                break;
            } catch (NumberFormatException e) {
                System.out.print("请输入整数:");
            }
        }
        System.out.println(cal(n1, n2));

    }

    public static double cal(int n1, int n2) {
        double result = 0;

        try {
            result = n1 / n2;
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("缺少命令行参数");
        }

        return result;
    }
}
