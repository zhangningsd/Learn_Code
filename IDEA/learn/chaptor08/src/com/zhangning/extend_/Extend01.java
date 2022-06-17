package com.zhangning.extend_;

public class Extend01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.setName("小明");
        pupil.setAge(12);
        pupil.testing();
        pupil.setScore(80.0);
        pupil.info();

        Graduate graduate = new Graduate();
        graduate.setName("大明");
        graduate.setAge(20);
        graduate.testing();
        graduate.setScore(90.0);
        graduate.info();

    }
}


