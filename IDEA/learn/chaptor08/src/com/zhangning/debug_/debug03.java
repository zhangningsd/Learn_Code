package com.zhangning.debug_;

import java.util.Arrays;

public class debug03 {
    public static void main(String[] args) {
        int[] arr = {8, -1, 199, 70, 10};
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
