package com.zhangning.homework05and06;

public class Scientist extends Employee {
    private double annual_bonus;
    public Scientist(String name, double salary, double annual_bonus) {
        super(name, salary);
        this.annual_bonus = annual_bonus;
    }

    @Override
    public void showSalary() {
        System.out.println("员工:" + this.getName() + " 工资:" + (this.getSalary() + annual_bonus));
    }
}
