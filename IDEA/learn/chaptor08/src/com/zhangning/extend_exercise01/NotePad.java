package com.zhangning.extend_exercise01;

public class NotePad extends PC{
    private String color;

    public NotePad() {
    }

    public NotePad(String cpu, int memory, int hard_drive, String brand, String color) {
        super(cpu, memory, hard_drive, brand);
        this.color = color;
    }
}
