package com.zhangning.homework03;

public class Professor extends Teacher {
    private double salary_level = 1.3;

    public Professor(String name, int age, String post, double salary) {
        super(name, age, post, salary);
    }

    @Override
    public void introduce() {
        System.out.println("姓名:" + this.getName() + " 年龄:" + this.getAge() + " 职称:" + this.getPost() + " 工资:" + this.getSalary() * salary_level);
    }
}
