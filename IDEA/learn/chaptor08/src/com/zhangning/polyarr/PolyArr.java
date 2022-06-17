package com.zhangning.polyarr;

public class PolyArr {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        people[0] = new Person("jack", 20);
        people[1] = new Student("zn", 22, 99);
        people[2] = new Student("zyh", 21, 98);
        people[3] = new Teacher("hsp", 43, 5000);
        people[4] = new Teacher("zxc", 34, 2300);

        for (int i = 0; i < people.length; i++){
            System.out.println(people[i].say());
            if(people[i] instanceof Student){
                Student student = (Student) people[i];
                student.study();
            }else if(people[i] instanceof Teacher){
                Teacher teacher = (Teacher) people[i];
                teacher.teach();
            }else if (people[i] instanceof Person){
//                System.out.println("error");
            }else {
                System.out.println("ERROR");
            }
        }
    }
}
