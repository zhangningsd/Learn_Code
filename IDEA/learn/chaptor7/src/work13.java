public class work13 {
    public static void main(String[] args) {
        Circle circle =new Circle(1);
        PassObject p = new PassObject();
        p.printAreas(circle, 5);
    }
}

class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * this.radius * this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class PassObject {
    public void printAreas(Circle c, int times) {
        System.out.println("Radius\t\tArea");
        for (int i = 1; i <= times; i++) {
            c.setRadius(i);
            System.out.println((double) i + "\t\t\t" + c.findArea());
        }
    }
}