package com.zhangning.extend_;

public class Student {

    public String name;
    public int age;
    private double score;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void testing() {
        System.out.println("学生名：" + this.name + " 正在考数学...");
    }

    public void info() {
        System.out.println("学生名：" + this.name + " 年龄：" + this.age + " 分数：" + this.score);
    }
}
