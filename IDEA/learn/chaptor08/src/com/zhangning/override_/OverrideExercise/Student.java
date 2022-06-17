package com.zhangning.override_.OverrideExercise;

public class Student extends Person {
    private int id;
    private double score;

    public Student() {

    }

    public Student(int id, double score) {
        this.id = id;
        this.score = score;
    }

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String say() {
        return super.say() + " ID是" + this.id + " 分数是" + this.score;
    }
}
