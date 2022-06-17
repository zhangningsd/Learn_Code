package com.zhangning.homework01and02;

public class HomeWork01 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("zn", 22, "student");
        persons[1] = new Person("zyh", 21, "student");
        persons[2] = new Person("cxy", 23, "student");


        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons.length - i - 1; j++) {
                Person temp = null;
                if (persons[j].getAge() > persons[j + 1].getAge()) {
                    temp = persons[j + 1];
                    persons[j + 1] = persons[j];
                    persons[j] = temp;
                }
            }
        }

        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].getName() + "\t" + persons[i].getAge() + "\t" + persons[i].getJob());
        }
    }
}
