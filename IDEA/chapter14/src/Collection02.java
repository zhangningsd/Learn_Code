import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
@SuppressWarnings({"all"})
public class Collection02 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("qwe", 12));
        list.add(new Dog("asd", 13));
        list.add(new Dog("zxc", 14));

        System.out.println("迭代器:");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("增强 for:");
        for (Object o :list) {
            System.out.println(o);
        }

    }
}

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
