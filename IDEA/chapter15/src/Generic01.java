
import java.util.HashSet;
import java.util.Set;

public class Generic01 {
    public static void main(String[] args) {
        Student student1 = new Student("qwe", 123);
        Student student2 = new Student("asd", 456);
        Student student3 = new Student("zxc", 789);
        HashSet<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        for (Student s: students) {
            System.out.println(s);
        }
    }



}

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
