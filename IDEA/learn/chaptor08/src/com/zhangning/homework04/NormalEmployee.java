package com.zhangning.homework04;

public class NormalEmployee extends Employee {
    private double level = 1.0;
    public NormalEmployee(String name, double salary, int day) {
        super(name, salary, day);
    }

    @Override
    public void showSalary() {
        System.out.println("普通员工:" + this.getName() + " 单日工资:" + this.getSalary() + " 工作天数:" + this.getDay() + " 总工资:" +
                (1000 + this.getSalary() * this.getDay() * level));
    }
}
