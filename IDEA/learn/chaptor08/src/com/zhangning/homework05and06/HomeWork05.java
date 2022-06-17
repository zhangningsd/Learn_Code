package com.zhangning.homework05and06;

public class HomeWork05 {
    public static void main(String[] args) {
        Worker worker = new Worker("q", 2000);
        Farmer farmer = new Farmer("a", 3000);
        Waiter waiter = new Waiter("z", 4000);
        Teacher teacher = new Teacher("w", 5000, 20, 200);
        Scientist scientist = new Scientist("s", 7000, 10000);
        waiter.showSalary();
        worker.showSalary();
        farmer.showSalary();
        teacher.showSalary();
        scientist.showSalary();
    }
}
