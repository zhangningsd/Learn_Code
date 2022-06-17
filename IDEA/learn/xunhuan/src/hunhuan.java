import java.util.Scanner;

public class hunhuan {
    public static void main(String[] args) {

//        int sum = 0;
//        int count = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 9 == 0) {
//                System.out.println(i);
//                count = count + 1;
//                sum = sum + i;
//            }
//        }
//        System.out.println(count);
//        System.out.println(sum);

//        int i, j;
//        for (i = 0, j = 5; i < 6 && j >= 0; i++, j--) {
//            int sum = i + j;
//            System.out.println(i + " + " + j + " = " + sum);
//        }


//        int i;
//        int start, end;
//        int sum, count;
//        sum = 0;
//        count = 0;
//        start = 1;
//        end = 200;
//        i = start;

//        while (i <= end){
//            if (i % 2 == 0){
//                System.out.println(i);
//            }
//            i++;
//        }

//        do {
//            sum = sum + i;
//            i++;
//        } while (i <= end);
//        System.out.println(sum);

//        do {
//            if (i % 5 == 0 && i % 3 != 0) {
//                count++;
//            }
//            i++;
//        } while (i <= end);
//        System.out.println(count);


//        Scanner scanner = new Scanner(System.in);
//        boolean money = true;
//        do {
//            System.out.println("闪电五连鞭");
//            System.out.println("还不还钱？");
//            String ans = scanner.next();
//            if (ans.equals("y")){
//                money = false;
//                //break;
//            }
//        }while (money);
//        System.out.println("还钱就不打了");

        // 打印99乘法表
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " * " + i + " = " + (i * j) + "  ");
//            }
//            System.out.println();
//        }

        int[] class1 = new int[5];
        int[] class2 = new int[5];
        int[] class3 = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入1班的成绩：");
        for (int j = 0; j <= 4; j++) {
            class1[j] = scanner.nextInt();
//        }
//        for (int j = 0; j <= 4; j++) {
            sum1 = sum1 + class1[j];
            if (class1[j] >= 60){
                count1++;
            }
        }
        System.out.println("请输入2班的成绩：");
        for (int j = 0; j <= 4; j++) {
            class2[j] = scanner.nextInt();
//        }
//        for (int j = 0; j <= 4; j++) {
            sum2 = sum2 + class2[j];
            if (class2[j] >= 60){
                count2++;
            }
        }
        System.out.println("请输入3班的成绩：");
        for (int j = 0; j <= 4; j++) {
            class3[j] = scanner.nextInt();
//        }
//        for (int j = 0; j <= 4; j++) {
            sum3 = sum3 + class3[j];
            if (class3[j] >= 60){
                count3++;
            }
        }

        System.out.println("1班的平均分：" + (sum1 / 5) + "\t" + "及格人数为：" + count1);
        System.out.println("2班的平均分：" + (sum2 / 5) + "\t" + "及格人数为：" + count2);
        System.out.println("3班的平均分：" + (sum3 / 5) + "\t" + "及格人数为：" + count3);


    }
}

