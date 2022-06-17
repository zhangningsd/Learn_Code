package com.zn.abstract_;


public class TestTemplate {
    public static void main(String[] args) {
        AA aa = new AA();
        aa.job();
    }
}

class AA{
    public void job(){
        long start = System.currentTimeMillis();
        long num = 0;
        for (long i = 0; i <= 100000000; i++) {
            num += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println(num);
    }
}