package com.zhangning.debug_;

public class debug01 {
    public static void main(String[] args) {
        int res = 0;
        for (int i = 0; i < 5; i++){
            res += i;
            System.out.println(i);
            System.out.println(res);
        }
        System.out.println("out");
    }
}
