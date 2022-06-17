import java.util.Arrays;
import java.util.Scanner;

public class StringBuffer01 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("输入商品名:");
//        String name = scanner.next();
//        System.out.print("输入价格:");
//        String price = scanner.next();
//        StringBuffer stringBuffer = new StringBuffer(price);
//        int index = stringBuffer.lastIndexOf(".");
//        while (true) {
//            index = index - 3;
//            if (index > 0) {
//                stringBuffer.insert(index, ',');
//            } else {
//                break;
//            }
//        }
//        System.out.println(name + "\t" + stringBuffer);
        int [] ins = {1, 2, 3, 5};
        Arrays.toString(ins);
        Arrays.binarySearch(ins,3);

        for (int i = 0; i < 10; i++) {
            System.out.println(randomInt(0,10));
        }
    }

    public static int randomInt(int a, int b) {
        return (int) (a + Math.random() * (b - a + 1));
    }
}
