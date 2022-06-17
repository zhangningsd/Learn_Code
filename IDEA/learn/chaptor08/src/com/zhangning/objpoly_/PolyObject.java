package com.zhangning.objpoly_;

public class PolyObject {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        animal1.cry();
        animal1 = new Cat();
        animal1.cry();

        Animal animal2 = new Cat();
        animal2.cry();

        Animal animal = new Animal();
        animal.cry();
    }
}
