import java.util.Scanner;

public class work05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        Circle01 circle = new Circle01(radius);
        double perimeter = circle.getPerimeter();
        double area = circle.getArea();

        System.out.println("周长是" + perimeter + "面积是" + area);
    }
}

class Circle01 {
    double radius;

    public Circle01(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }
}
