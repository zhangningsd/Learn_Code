import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSystem {
    public static void main(String[] args) {

        boolean loop = true;
        String key = "";
        String detail = "--------------零钱通明细---------------";
        String note = "";
        String choice = "";
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("==============零钱通菜单==============");
            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.收益入账");
            System.out.println("\t\t\t3.消费");
            System.out.println("\t\t\t4.退出");

            System.out.print("请选择:");
            key = scanner.next();

            switch (key) {
                case "1":
                    System.out.println(detail);
                    break;
                case "2":
                    System.out.print("收益入账金额:");
                    money = scanner.nextDouble();
                    if (money <= 0) {
                        System.out.println("金额应大于0");
                        break;
                    }
                    balance += money;
                    date = new Date();
                    detail += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.print("消费金额:");
                    money = scanner.nextDouble();
                    if (money <= 0 || money > balance) {
                        System.out.println("消费金额应该在 0-" + balance + "之间");
                        break;
                    }
                    System.out.print("消费说明:");
                    note = scanner.next();
                    balance -= money;
                    detail += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
                    System.out.print("是否确认退出(y/n):");
                    while (true) {
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        } else {
                            System.out.print("请重新输入:");
                        }
                    }
                    if ("y".equals(choice)) {
                        loop = false;
                        System.out.println("---------退出----------");
                    }
                    break;
                default:
                    System.out.println("输入有误，请重新选择");
                    break;

            }

        } while (loop);
    }
}
