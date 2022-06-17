import java.util.Calendar;
import java.util.Scanner;

public class work06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入第一个对象的两个数：");
        double a1 = scanner.nextDouble();
        double b1 = scanner.nextDouble();
        System.out.println("输入第二个对象的两个数：");
        double a2 = scanner.nextDouble();
        double b2 = scanner.nextDouble();

        Cale cale1 = new Cale(a1, b1);
        Cale cale2 = new Cale(a2, b2);

        System.out.println("第一个对象的和为：" + cale1.getSum() + " 差为：" + cale1.getSub() + " 积为：" + cale1.getMux() + " 商为：" + cale1.getDiv());
        System.out.println("第一个对象的和为：" + cale2.getSum() + " 差为：" + cale2.getSub() + " 积为：" + cale2.getMux() + " 商为：" + cale2.getDiv());

    }
}

class Cale {
    double a;
    double b;

    public Cale(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getSum() {
        return this.a + this.b;
    }

    public double getSub() {
        return this.a - this.b;
    }

    public double getMux() {
        return this.a * this.b;
    }

    public Double getDiv() {
        if (this.b == 0) {
            System.out.println("输入的被除数有误，无法得到商");
            return null;
        }else {
            return this.a / this.b;
        }
    }
}