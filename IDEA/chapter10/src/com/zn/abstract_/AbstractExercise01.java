package com.zn.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager manager = new Manager("zzxc", 23, 1233);
        CommonEmployee employee = new CommonEmployee("Asd", 232, 12);
        manager.work();
        employee.work();
    }
}
