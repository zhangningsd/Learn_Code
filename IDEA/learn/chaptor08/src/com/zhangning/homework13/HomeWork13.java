package com.zhangning.homework13;

public class HomeWork13 {
    public static void main(String[] args) {
        Person[] persons = new Person[4];
        persons[0] = new Student("qwe", "male", 14, 1234);
        persons[1] = new Student("asd", "female", 25, 1245);
        persons[2] = new Teacher("zxc", "female", 22, 2);
        persons[3] = new Teacher("rty", "male", 34, 10);

        for (int i = 0; i < persons.length; i++) {
            for (int j = 0; j < persons.length - i - 1; j++) {
                Person person = new Person();
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    person = persons[j + 1];
                    persons[j + 1] = persons[j];
                    persons[j] = person;
                }
            }
        }

        for (Person person : persons) {
            if (person instanceof Student) {
                System.out.println("学生" + person.getName() + "\t" + person.getSex() + "\t" + person.getAge() + "\t" + ((Student) person).getStu_id());
            } else {
                System.out.println("老师" + person.getName() + "\t" + person.getSex() + "\t" + person.getAge() + "\t" + ((Teacher) person).getWork_age());
            }
        }

        Teacher teacher = new Teacher("王飞", "男", 30, 5);
        Student student = new Student("小明", "男", 15, 23102);

        System.out.println("老师的信息:");
        System.out.println("姓名:" + teacher.getName());
        System.out.println("年龄:" + teacher.getAge());
        System.out.println("性别:" + teacher.getSex());
        System.out.println("工龄:" + teacher.getWork_age());
        teacher.teach();
        System.out.println(teacher.play());
        System.out.println("-----------------------------------");
        System.out.println("学生的信息:");
        System.out.println("姓名:" + student.getName());
        System.out.println("年龄:" + student.getAge());
        System.out.println("性别:" + student.getSex());
        System.out.println("学号:" + student.getStu_id());
        student.study();
        System.out.println(student.play());


    }
}
