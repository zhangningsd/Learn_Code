import java.util.Scanner;
public class fenzhi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入月份：");
        int month = scanner.nextInt();

        switch (month){
            case 3:
                //System.out.println("春季");
            case 4:
                //System.out.println("春季");
            case 5:
                System.out.println("春季");break;
            case 6:
                //System.out.println("夏季");
            case 7:
                //System.out.println("夏季");
            case 8:
                System.out.println("夏季");break;
            case 9:
                //System.out.println("秋季");
            case 10:
                //System.out.println("球季");
            case 11:
                System.out.println("球季");break;
            case 12:
                //System.out.println("冬季");
            case 1:
                //System.out.println("冬季");
            case 2:
                System.out.println("冬季");break;
            default:
                System.out.println("输入错误");break;
        }

    }
}
