import java.util.HashSet;
import java.util.Objects;

@SuppressWarnings({"all"})
public class HashSetExercise02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee1("zn", 1234, new MyDate(1999, 12, 9)));
        hashSet.add(new Employee1("zyh", 2341, new MyDate(2000, 4, 8)));
        hashSet.add(new Employee1("zn", 12343, new MyDate(1999, 12, 9)));
        hashSet.add(new Employee1("cxy", 3213, new MyDate(1998, 7, 25)));

        System.out.println(hashSet);
    }
}

class Employee1 {
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee1(String name, double sal, MyDate birthday) {
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
        return "Employee1{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee1)) return false;
        Employee1 employee1 = (Employee1) o;
        return Objects.equals(name, employee1.name) && birthday.equals(employee1.getBirthday());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }
}

class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyDate)) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        return year + "年" + month + "月" + day + "日";
    }
}
