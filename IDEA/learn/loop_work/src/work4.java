import java.util.Scanner;

public class work4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个三位数：");
        int number = scanner.nextInt();
        int num = number;
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            sum = (int) (sum + Math.pow(num % 10, 3));
            num = num / 10;
        }
        if (number == sum){
            System.out.println("是水仙花数");
        }else {
            System.out.println("不是水仙花数");
        }
    }
}
