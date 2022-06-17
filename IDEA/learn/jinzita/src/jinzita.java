import java.util.Scanner;
// 打印空心金字塔
//      *
//     *  *
//    *    *
//   ********
public class jinzita {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入层数：");
        int levels = scanner.nextInt();
        int i = 1;
        for (; i <= levels; i++) {
            int j = 1;
            if (i != levels){
                for (; j <= 2 * levels - 1; j++) {
                    if (j == levels - i + 1 || j == levels + i - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            else {
                for (; j <= 2 * levels - 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
