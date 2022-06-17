package com.zn.final_;

public class FinalExercise01 {
    public static void main(String[] args) {

    }
}


class Circle{
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
//        PI = 3.14;
    }
    {
//        PI = 3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}