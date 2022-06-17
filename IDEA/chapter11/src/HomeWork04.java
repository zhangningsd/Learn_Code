/**
 * @author ZhangNing
 */
public class HomeWork04 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.testWork(new Calculator() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }, 12, 213);

    }
}

interface Calculator {
    double work(double n1, double n2);
}

class Phone {

    public void testWork(Calculator calculator, double n1, double n2) {
        double res = calculator.work(n1, n2);
        System.out.println(res);
    }
}
