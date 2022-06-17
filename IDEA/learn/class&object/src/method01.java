public class method01 {
    public static void main(String[] args) {

        person p1 = new person();
        p1.age = 12;
        p1.name = "zhangning";
        p1.speak();
        p1.cal01();
        p1.cal02(100);
        p1.cal03(10, 123);

    }

}

class person {
    int age;
    String name;

    public void speak() {
        System.out.println("我是好人");
    }

    public void cal01() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void cal02(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void cal03(int a, int b) {
        System.out.println((a + b));
    }

}