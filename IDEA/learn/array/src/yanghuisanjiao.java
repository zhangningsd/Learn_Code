import java.util.Scanner;

public class yanghuisanjiao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入行数：");
        int row = scanner.nextInt();

        int[][] array = new int[row][];
        for (int i = 0; i < row; i++) {
            array[i] = new int[i + 1];
//            if (i < 2) {
//                for (int n = 0; n <= i; n++) {
//                    array[i][n] = 1;
//                }
//            } else {
//                array[i][0] = 1;
//                array[i][i] = 1;
//                for (int j = 1; j <= i - 1; j++) {
//                    array[i][j] = array[i - 1][j] + array[i - 1][j - 1];
//                }
//            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j== array[i].length - 1){
                    array[i][j] = 1;
                } else {
                    array[i][j] = array[i - 1][j] + array[i - 1][j - 1];
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
