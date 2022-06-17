import java.util.Objects;
import java.util.Scanner;

public class HousingRentalSystem {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key;
    int id = 0;
    int[] rental = new int[100];
    int[] phone = new int[100];
    String[] address = new String[100];
    String[] name = new String[100];
    String[] status = new String[100];


    public void menu() {
        do {
            System.out.println("==============房屋出租系统==============");
            System.out.println("\t\t\t1.新增房源");
            System.out.println("\t\t\t2.查找房屋");
            System.out.println("\t\t\t3.删除房屋");
            System.out.println("\t\t\t4.修改房屋");
            System.out.println("\t\t\t5.房屋列表");
            System.out.println("\t\t\t6.退   出");

            System.out.print("请选择:");
            key = scanner.next();

            switch (key) {
                case "1":
                    this.addHouse();
                    break;
                case "2":
                    this.searchHouse();
                    break;
                case "3":
                    this.deleteHouse();
                    break;
                case "4":
                    this.modifyHouse();
                    break;
                case "5":
                    this.listHouse();
                    break;
                case "6":
                    this.quitSys();
                    break;
                default:
                    System.out.println("输入有误，请重新选择");
                    break;
            }
        } while (loop);
    }

    public void addHouse() {
        System.out.println("-----------------添加房屋-----------------");
        System.out.print("姓名:");
        name[id] = scanner.next();
        System.out.print("电话:");
        phone[id] = scanner.nextInt();
        System.out.print("地址:");
        address[id] = scanner.next();
        System.out.print("月租:");
        rental[id] = scanner.nextInt();
        System.out.print("状态:");
        status[id] = scanner.next();
        id++;
        System.out.println("-----------------添加完成-----------------");

    }

    public void searchHouse() {
        System.out.println("-----------------查找房屋-----------------");
        System.out.print("请输入要查找的房屋id:");
        int num = scanner.nextInt();
        if (name[num - 1] == null) {
            System.out.println("----------------没有该房屋----------------");
        } else {
            System.out.println(num + "\t" + name[num - 1] + "\t" + phone[num - 1] + "\t" + address[num - 1] + "\t" + rental[num - 1] + "\t" + status[num - 1]);
        }

    }

    public void deleteHouse() {
        System.out.println("-----------------删除房屋-----------------");
        System.out.print("请输入待删除房屋编号(-1退出)");
        int delete_id = scanner.nextInt();
        if (delete_id != -1) {
            System.out.print("确认是否删除(Y/N):");
            String confirm = scanner.next();
            if ("Y".equals(confirm)) {
//                this.deleteString(name, delete_id);
//                this.deleteInt(phone, delete_id);
//                this.deleteString(address, delete_id);
//                this.deleteInt(rental, delete_id);
//                this.deleteString(status, delete_id);
                name[delete_id - 1] = null;
            }
        }
    }

    public void modifyHouse() {
        System.out.println("-----------------修改房屋-----------------");
        System.out.print("请输入待修改房屋编号(-1退出)");
        int modify_id = scanner.nextInt();
        if (modify_id == -1) {
            return;
        } else if (name[modify_id - 1] == null){
            System.out.println("-----------------没有该房屋-----------------");
        }
        else {
            System.out.print("姓名" + "(" + name[modify_id - 1] + "):");
//            if (scanner.next().length() == 0) {
//                return;
//            } else {
//                name[modify_id - 1] = scanner.next();
//            }
            name[modify_id - 1] = scanner.next();
            System.out.print("电话" + "(" + phone[modify_id - 1] + "):");
//            if (scanner.next().length() == 0) {
//                return;
//            } else {
//                phone[modify_id - 1] = scanner.nextInt();
//            }
            phone[modify_id - 1] = scanner.nextInt();

            System.out.print("地址" + "(" + address[modify_id - 1] + "):");
//            if (scanner.next().length() == 0) {
//                return;
//            } else {
//                address[modify_id - 1] = scanner.next();
//            }
            address[modify_id - 1] = scanner.next();
            System.out.print("租金" + "(" + rental[modify_id - 1] + "):");
//            if (scanner.next().length() == 0) {
//                return;
//            } else {
//                rental[modify_id - 1] = scanner.nextInt();
//            }
            rental[modify_id - 1] = scanner.nextInt();
            System.out.print("状态" + "(" + status[modify_id - 1] + "):");
//            if (scanner.next().length() == 0) {
//                return;
//            } else {
//                status[modify_id - 1] = scanner.next();
//            }
            status[modify_id - 1] = scanner.next();
        }
        System.out.println("-----------------修改完成-----------------");
    }

    public void listHouse() {
        System.out.println("-----------------房屋列表-----------------");
        System.out.println("编号\t\t\t" + "房主\t\t\t" + "电话\t\t\t" + "地址\t\t\t" + "月租\t\t\t" + "状态");
        for (int i = 0; i < name.length; i++) {
            if (name[i] != null) {
                System.out.println((i + 1) + "\t\t\t" + name[i] + "\t\t\t" + phone[i] + "\t\t" + address[i] + "\t\t" + rental[i] + "\t\t" + status[i]);
            }
        }
        System.out.println("-----------------房屋列表完成-----------------");

    }

    public void quitSys(){
        System.out.print("请确认(Y/N):");
        while(true) {
            String choice = scanner.next();
            if ("N".equals(choice)){
                return;
            }else if ("Y".equals(choice)){
                loop = false;
                System.out.println("退出系统");
                break;
            }else {
                System.out.print("输入错误,请重新输入:");
            }
        }

    }


//    public void deleteString(Object[] objects, int pos) {
//        if (objects.length - (pos - 1) >= 0)
//            System.arraycopy(objects, pos - 1 + 1, objects, pos - 1, objects.length - (pos - 1));
//    }
//
//    public void deleteInt(int[] objects, int pos) {
//        if (objects.length - (pos - 1) >= 0)
//            System.arraycopy(objects, pos - 1 + 1, objects, pos - 1, objects.length - (pos - 1));
//    }

}
