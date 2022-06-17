package com.zn.inner_;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("起床啦");
            }
        });
        phone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课了");
            }
        });
    }
}

interface Bell {
    void ring();
}

class Phone {
    public void alarmClock(Bell bell) {
        bell.ring();
    }

}

