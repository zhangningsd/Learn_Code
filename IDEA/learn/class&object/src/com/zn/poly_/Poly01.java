package com.zn.poly_;

public class Poly01 {
    public static void main(String[] args) {
        Master ZN = new Master("张宁");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("大棒骨");
        Cat cat = new Cat("咪咪");
        Fish fish = new Fish("黄花鱼");

        ZN.feed(dog, bone);
        ZN.feed(cat, fish);

    }
}
