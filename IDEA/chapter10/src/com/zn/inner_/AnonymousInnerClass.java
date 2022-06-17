package com.zn.inner_;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer01 outer01 = new Outer01();
        outer01.me();
    }
}


class Outer01 {
    private int n1 = 10;

    public void me() {

        A a = new A() {
            @Override
            public void cry() {
                System.out.println("asadasd");
            }
        };
        a.cry();
        System.out.println(a.getClass());
    }
}

interface A {
    public void cry();
}

class Father {
    public Father(String name) {
        super();
    }

    public void test() {
    }
}