//已知一个有序数组，插入一个数，仍是有序数组
import java.util.Scanner;

public class case7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要插入的数：");
        int num = scanner.nextInt();
        int[] arr = {10, 12, 45, 90};
        int[] arr_new = new int[arr.length + 1];
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            arr_new[i] = arr[i];
        }

        for (int i = 0; i < arr_new.length; i++) {
            if (num < arr_new[i]) {
                index = i;
                break;
            }else {
                index = arr_new.length - 1;
            }
        }

        for (int j = arr_new.length - 1; j > index; j--) {
            arr_new[j] = arr_new[j - 1];
        }
        arr_new[index] = num;
        arr = arr_new;

        for (int i = 0;i <arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }
}
