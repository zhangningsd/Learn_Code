package com.zhangning.extend_exercise01;

public class Computer {
    private String cpu;
    private int memory;
    private int hard_drive;

    public Computer() {
    }

    public Computer(String cpu, int memory, int hard_drive) {
        this.cpu = cpu;
        this.memory = memory;
        this.hard_drive = hard_drive;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getHard_drive() {
        return hard_drive;
    }

    public void setHard_drive(int hard_drive) {
        this.hard_drive = hard_drive;
    }

    public String getDetails() {
        return "cpu= " + cpu + " memory=" + memory + " hard_drive=" + hard_drive;
    }


}
