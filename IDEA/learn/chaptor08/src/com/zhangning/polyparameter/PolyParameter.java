package com.zhangning.polyparameter;

public class PolyParameter {
    public static void main(String[] args) {
        Worker worker1 = new Worker("tom", 2000);
        Manager manager1 = new Manager("milan", 10000, 20000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(worker1);
        polyParameter.showEmpAnnual(manager1);
        polyParameter.testWork(worker1);
        polyParameter.testWork(manager1);
    }

    public void showEmpAnnual(Employee employee) {
        System.out.println(employee.getAnnual());
    }

    public void testWork(Employee employee) {
        if (employee instanceof Worker) {
            ((Worker) employee).work(); //向下转型
        } else if (employee instanceof Manager) {
            ((Manager) employee).manage();
        }else {
            System.out.println();
        }
    }
}
