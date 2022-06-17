package com.zn.houserent.view;


import com.zn.houserent.domain.House;
import com.zn.houserent.service.HouseService;
import com.zn.houserent.utils.Utility;

public class HouseView {
    //界面层
    //1. 显示界面
    //2. 接受输入
    //3. 调用其他类，完成对房屋信息的操作,增删改查(crud)
    private boolean loop = true;
    private HouseService houseService = new HouseService(10);

    public void mainMenu() {
        do {
            System.out.println("==============房屋出租系统==============");
            System.out.println("\t\t\t1.新增房源");
            System.out.println("\t\t\t2.查找房屋");
            System.out.println("\t\t\t3.删除房屋");
            System.out.println("\t\t\t4.修改房屋");
            System.out.println("\t\t\t5.房屋列表");
            System.out.println("\t\t\t6.退   出");

            System.out.print("请选择:");
            char key = Utility.readChar();

            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    deleteHouse();
                    break;
                case '4':
                    modifyHouse();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    quit();
                    System.out.println("退出系统");
                    break;
                default:
                    System.out.println("输入有误，请重新选择");
                    break;
            }
        } while (loop);
    }

    public void listHouses() {
        System.out.println("-----------------房屋列表-----------------");
        System.out.println("编号\t\t" + "房主\t\t" + "电话\t\t" + "地址\t\t" + "月租\t\t" + "状态");
        House[] houses = houseService.list();//得到所有房屋信息
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            } else {
                System.out.println(houses[i]);
            }
        }
        System.out.println("----------------房屋列表完成----------------");
    }

    public void addHouse() {
        System.out.println("-----------------添加房屋-----------------");
        System.out.print("姓名:");
        String name = Utility.readString(8);
        System.out.print("电话:");
        String phone = Utility.readString(12);
        System.out.print("地址:");
        String address = Utility.readString(16);
        System.out.print("月租:");
        int rent = Utility.readInt();
        System.out.print("状态:");
        String state = Utility.readString(3);

        House house = new House(0, name, phone, address, rent, state);
        houseService.add(house);
//        if (houseService.add(house)){
        System.out.println("----------------添加房屋成功----------------");
//        }else {
//            System.out.println("----------------添加房屋失败----------------");
//        }
    }

    public void deleteHouse() {
        System.out.println("-----------------删除房屋-----------------");
        System.out.print("请输入待删除房屋编号(-1退出):");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("--------------放弃删除------------");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if ('Y' == choice) {
            if (houseService.del(delId)) {
                System.out.println("----------------删除房屋成功----------------");
            } else {
                System.out.println("----------------删除房屋失败----------------");
            }
        }
    }

    public void findHouse() {
        System.out.println("-----------------查找房屋-----------------");
        System.out.print("请输入查找房屋编号(-1退出):");
        int findId = Utility.readInt();
        House house = houseService.findById(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("--------------查找的房屋信息不存在--------------");
        }
    }

    public void modifyHouse() {
        System.out.println("-----------------修改房屋-----------------");
        System.out.print("请输入修改房屋编号(-1退出):");
        int modifyId = Utility.readInt();
        if (modifyId == -1) {
            System.out.println("放弃修改");
            return;
        }
        House house = houseService.findById(modifyId);
        if (house == null) {
            System.out.println("--------------修改的房屋信息不存在--------------");
            return;
        }
        System.out.print("姓名(" + house.getName() + "):");
        String name = Utility.readString(8, "");
        if (!"".equals(name)){
            house.setName(name);
        }


        System.out.print("电话(" + house.getPhone() + "):");
        String phone = Utility.readString(12, "");
        if (!"".equals(phone)){
            house.setPhone(phone);
        }

        System.out.print("地址(" + house.getAddress() + "):");
        String address = Utility.readString(16, "");
        if (!"".equals(address)){
            house.setAddress(address);
        }

        System.out.print("月租(" + house.getRent() + "):");
        int rent = Utility.readInt(-1);
        if (rent != -1){
            house.setRent(rent);
        }

        System.out.print("状态(" + house.getState() + "):");
        String state = Utility.readString(3, "");
        if (!"".equals(state)){
            house.setState(state);
        }
        System.out.println("-----------------修改房屋成功-----------------");
    }

    public void quit() {
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }
}
