package com.zhangning.homework05and06;

public class Teacher extends Employee {
    private int day;
    private double pay;

    public Teacher(String name, double salary, int day, double pay) {
        super(name, salary);
        this.day = day;
        this.pay = pay;
    }

    @Override
    public void showSalary() {
        System.out.println("员工:" + this.getName() + " 工资:" + (this.getSalary() + pay * day));
    }
}
