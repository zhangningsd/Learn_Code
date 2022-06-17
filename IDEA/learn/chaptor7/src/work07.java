public class work07 {
    public static void main(String[] args) {
        Dog dog = new Dog("旺财", "花色", 2);
        dog.show();
    }
}

class Dog {
    String name;
    String color;
    int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void show() {
        System.out.println("名字：" + this.name + " 颜色：" + this.color + " 年龄:" + this.age);
    }

}