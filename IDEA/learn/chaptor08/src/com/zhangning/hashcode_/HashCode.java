package com.zhangning.hashcode_;

public class HashCode {
    public static void main(String[] args) {
        AA aa = new AA();
        AA bb = new AA();
        AA cc = aa;
        System.out.println(aa.hashCode());
        System.out.println(bb.hashCode());
        System.out.println(cc.hashCode());
    }
}
class AA{}