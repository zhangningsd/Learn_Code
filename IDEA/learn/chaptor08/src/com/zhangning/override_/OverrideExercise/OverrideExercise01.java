package com.zhangning.override_.OverrideExercise;

public class OverrideExercise01 {
    public static void main(String[] args) {
        Person person = new Person("ZN", 22);
        System.out.println(person.say());
        Student student = new Student("ZYH", 21, 202132756, 213.213);
        System.out.println(student.say());
    }

}
