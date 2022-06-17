import java.util.Scanner;

/**
 * @author ZhangNing
 */
public class HomeWork06 {
    public static void main(String[] args) {
        Horse horse =  new Horse();
        Boat boat = new Boat();
        Person person = new Person();
        person.setName("唐僧");
        Scanner scanner = new Scanner(System.in);
        String road = scanner.next();
        if ("river".equals(road)){
            person.setVehicle(boat);

        } else {
            person.setVehicle(horse);
        }
        person.getVehicle().work();

    }
}

interface Vehicles {
    void work();
}   

class Horse implements Vehicles {
    @Override
    public void work() {
        System.out.println("马");
    }
}

class Boat implements Vehicles {
    @Override
    public void work() {
        System.out.println("船");
    }
}

class Person {
    private String name;
    private Vehicles vehicle;

    public Person(){

    }

    public Person(String name, Vehicles vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicles getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicles vehicle) {
        this.vehicle = vehicle;
    }
}
