import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys_OOP {
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    String detail = "--------------零钱通明细---------------";
    double money = 0;
    double balance = 0;
    String note = "";
    String choice = "";
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    public void mainMenu() {
        do {
            System.out.println("==============选择零钱通菜单==============");
            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.收益入账");
            System.out.println("\t\t\t3.消费");
            System.out.println("\t\t\t4.退出");

            System.out.print("请选择:");
            key = scanner.next();

            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                   this.exit();
                   break;
                default:
                    System.out.println("输入有误，请重新选择");
                    break;
            }
        } while (loop);
    }

    public void detail(){
        System.out.println(detail);
    }

    public void income(){
        System.out.print("收益入账金额:");
        money = scanner.nextDouble();
        if (money <= 0) {
            System.out.println("金额应大于0");
            return;
        }
        balance += money;
        date = new Date();
        detail += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    public void pay(){
        System.out.print("消费金额:");
        money = scanner.nextDouble();
        if (money <= 0 || money > balance) {
            System.out.println("消费金额应该在 0-" + balance + "之间");
            return;
        }
        System.out.print("消费说明:");
        note = scanner.next();
        balance -= money;
        detail += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    public void exit(){
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
    }
}
