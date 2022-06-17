public class work11 {
    public static void main(String[] args) {
        A04 a = new A04();
        a.test();
    }
}

class A04 {
    public double method(double a, double b) {
        System.out.println("调用了method");
        return a;
    }

    public void test(){
        System.out.println(method(method(10.0, 20.0), 100));
    }
}