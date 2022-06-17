package com.zhangning.detail_;

public class PolyDetail {
    public static void main(String[] args) {
        // 向上转型，父类引用指向了子类的对象
        Animal animal = new Cat();
        animal.eat();

        // 向下转型
        Cat cat = (Cat) animal;
        cat.catchMouse();
    }
}
