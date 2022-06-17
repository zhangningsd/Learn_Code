package com.zn.interface_;

public class Interface01 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        Phone phone = new Phone();
        Camera camera = new Camera();
        System.out.println(phone.a);
        System.out.println(Phone.a);
        System.out.println(UsbInterface.a);
        computer.work(phone);
        computer.work(camera);
    }
}
