package com.zn.houserent.service;

import com.zn.houserent.domain.House;

public class HouseService {
    //业务层
    //响应HouseView的调用
    //完成增删改查操作
    private House[] houses;
    private int houseNums = 1;
    private int idCounter = 1;

    public HouseService(int size) {
        houses = new House[size];
        houses[0] = new House(1, "jack", "123", "asd", 2103, "未出租");
    }

    public House[] list() {
        return houses;
    }

    public void add(House house) {
//        if (houseNums == houses.length){
//            System.out.println("已满，不能再添加");
//            return false;
//        }else {
//            houses[houseNums++] = house;
//            house.setId(++idCounter);
//            return true;
//        }
        //扩容数组
        if (houseNums == houses.length) {
            House[] newHouse = new House[houses.length + 1];
            System.arraycopy(houses, 0, newHouse, 0, houses.length);
            houses = newHouse;
        }
        houses[houseNums++] = house;
        house.setId(++idCounter);
    }

    public boolean del(int delId) {
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            return false;
        }
        for (int i = index; i < houseNums; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNums] = null;
        return true;
    }

    public House findById(int findId){
        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }

}
