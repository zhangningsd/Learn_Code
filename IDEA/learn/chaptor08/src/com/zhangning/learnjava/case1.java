package com.zhangning.learnjava;

public class case1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jackadada");
        person.setAge(130);
        person.setSalary(23000);
        System.out.println(person.info());


    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6){
            this.name = name;
        }else {
            System.out.println("名字须设置在2-6个字符之间，默认名字将设为usr");
            this.name = "usr";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄须设置在1-120之间，默认年龄设将为0");
            this.age = 0;
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "名字：" + this.name + " 年龄：" + this.age + " 薪水：" + this.salary;
    }
}
