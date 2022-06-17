package com.zhangning.extend_exercise01;

public class PC extends Computer{
    private String brand;

    public PC() {
    }

    public PC(String cpu, int memory, int hard_drive, String brand) {
        super(cpu, memory, hard_drive);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void info() {
        System.out.println("PC="+ getDetails());
    }
}
