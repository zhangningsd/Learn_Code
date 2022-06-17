package com.zn.static_;

public class ChildGame {
    public static void main(String[] args) {
        Child child1 = new Child("asds");
        child1.join();
        Child.count++;

        Child child2 = new Child("asadw");
        child2.join();
        Child.count++;

        Child child3 = new Child("asdsaasd");
        child3.join();
        Child.count++;
    }
}

class Child{
    private final String name;
    public static int count;

    public Child(String name) {
        this.name = name;
    }

    public void join(){
        System.out.println(name + "加入");
    }
}