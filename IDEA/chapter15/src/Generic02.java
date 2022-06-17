import java.util.ArrayList;
import java.util.Comparator;

public class Generic02 {
    public static void main(String[] args) {

        Employee e1 = new Employee("tom", 20000, new MyDate(1980,12,11));
        Employee e2 = new Employee("jack", 12000, new MyDate(2001,12,12));
        Employee e3 = new Employee("tom", 50000, new MyDate(1980,12,10));

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        System.out.println(employees);

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (!(o1.getName().equals(o2.getName()))) {
                    return o1.getName().compareTo(o2.getName());
                } else {
                    return o1.getBirthday().compareTo(o2.getBirthday());
                }
            }
        });
        System.out.println(employees);

    }
}
class Employee {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
