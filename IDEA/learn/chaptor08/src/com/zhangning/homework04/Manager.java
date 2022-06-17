package com.zhangning.homework04;

public class Manager extends Employee {
    private double level = 1.2;
    private double bonus;

    public Manager(String name, double salary, int day) {
        super(name, salary, day);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void showSalary() {
        System.out.println("部门经理:" + this.getName() + " 单日工资:" + this.getSalary() + " 工作天数:" + this.getDay() + " 总工资:" +
                (bonus + this.getSalary() * this.getDay() * level));
    }
}
