import java.util.Scanner;
import static java.lang.System.arraycopy;

public class case4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 3};
        while (true) {

            System.out.println("输入要添加的数：");
            int add = scanner.nextInt();
            System.out.println("是否继续添加(y/n)：");
            char yn = scanner.next().charAt(0);

            int[] array = new int[arr.length + 1];

            arraycopy(arr, 0, array, 0, arr.length);

            array[array.length - 1] = add;
            arr = array;

            if (yn == 'n') {
                break;
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
