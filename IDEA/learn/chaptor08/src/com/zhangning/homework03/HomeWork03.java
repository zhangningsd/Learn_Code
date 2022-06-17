package com.zhangning.homework03;

public class HomeWork03 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("zn", 34, "normal", 5000);
        Teacher professor = new Professor("asd", 56, "Professor", 10000);
        Teacher associate_professor = new AssociateProfessor("qwe", 45, "AssociateProfessor", 8000);
        Teacher lecturer = new Lecturer("zxc", 34, "Lecturer", 6000);

        teacher.introduce();
        System.out.println(teacher);
        professor.introduce();
        associate_professor.introduce();
        lecturer.introduce();

    }
}
