import java.util.Scanner;
public class arithmeticoperator {
    public static void main(String[] args) {
//        System.out.println(10.0 /4 );
//        double a = 10.0 / 4;
//        System.out.println(a);
//        int i = 1;
//        i = i++;
//        i = ++i;
//        System.out.println(i);
//        int remain_day = 59;
//        int week;
//        int day;
//        week = remain_day / 7;
//        day = remain_day % 7;
//        System.out.println("剩余" + week + "周" + day + "天放假");
//
//        double F = 234.5;
//        double C;
//        C = 5.0 / 9.0 * (F - 100);
//        System.out.println(C);

//        int x = 5, y = 5;
//        if(x++ == 5 || ++y == 5){
//            x = 11;
//        }
//        System.out.println(x+"   "+y);
//        int a, b, c;
//        a = 10000;
//        b = 1200;
//        c = 500;
//        int max;
//        max = (a > b && a > c)? a : (b > c ? b : c);
//        System.out.println(max);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入名字：");
//        String name = scanner.next();
//        System.out.println("请输入年龄：");
//        int age = scanner.nextInt();
//        System.out.println("请输入薪水：");
//        double salary = scanner.nextDouble();
//        if(age >= 20){
//            System.out.println(name + "年龄是" + age + "薪水是" + salary);
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份（1-12）：");
        int month = scanner.nextInt();
        System.out.println("请输入年龄：");
        int age = scanner.nextInt();
        int price_wangji = 60;
        int price_danji = 40;
        if(month >= 4 && month <= 10){
            if(age < 18){
                System.out.println("儿童票" + price_wangji /2 +"￥");
            }else if(age > 60){
                System.out.println("老人票" + price_wangji / 3 + "￥");
            }else {
                System.out.println("成人票" + price_wangji +"￥");
            }
        }else {
            if(age >= 18 && age <= 60){
                System.out.println("成人票" + price_danji +"￥");
            }else {
                System.out.println("其他票" + price_danji / 2 +"￥");
            }
        }
    }
}
