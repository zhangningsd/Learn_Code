package com.zhangning.homework04;

public class HomeWork04 {
    public static void main(String[] args) {
        Manager manager = new Manager("qe", 30000, 100);
        NormalEmployee nm = new NormalEmployee("zx", 6000, 200);
        manager.setBonus(1000);
        manager.showSalary();
        nm.showSalary();
    }
}
