package homework;

import java.util.ArrayList;

@SuppressWarnings({"all"})
public class HomeWork02 {
    public static void main(String[] args) {
        Car car1 = new Car("宝马", 400000);
        Car car2 = new Car("宾利", 5000000);

        ArrayList list = new ArrayList();
        list.add(car1);
        list.add(car2);

        list.remove(0);
        System.out.println(list.contains("宝马"));
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.clear();

    }
}

class Car {
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
