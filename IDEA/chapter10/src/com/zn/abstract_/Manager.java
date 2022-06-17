package com.zn.abstract_;

class Manager extends Employee {
    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("经理" + getName() + "工作中");
    }
}
