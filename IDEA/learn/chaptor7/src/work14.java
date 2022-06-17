import java.util.Scanner;

public class work14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;                                                      //每局状况输入数组
        int count = 0;                                                  //计算局数
        int Tom_number;                                                 //Tom输入的字符转成的数
        int result_number;                                              //比赛结果：0代表平手；1代表电脑赢；2代表Tom赢

        String Tom;                                                     //Tom输入的剪刀石头布
        String[] Tom_buffer = new String[200];                          //存放Tom输入
        String[] computer_buffer = new String[200];                     //存放电脑的石头剪刀布
        String[] result_string = new String[200];                       //存放结果文字

        caiquan c = new caiquan();

        do {
            System.out.println("Tom出拳（石头、剪刀、布）：");
            Tom = scanner.next();
            Tom_buffer[i] = Tom;                                        //存储Tom输入
            Tom_number = convert_to_number(Tom);                        //把Tom输入的文字转成数字

            c.computer_number = (int) (Math.random() * 3);              //电脑产生随机数
            computer_buffer[i] = convert_to_string(c.computer_number);  //把电脑产生的随机数转成文字存储

            result_number = c.result(Tom_number);                       //计算结果
            result_string[i] = convert_result(result_number);           //把结果转成文字存储

            i++;
            count++;

            System.out.println("还玩吗？");
        } while (scanner.next().charAt(0) != 'n');                      //输入 n 退出游戏

        String[] Tom_buffer_new;                                        //存放Tom输入
        String[] computer_buffer_new;                                   //存放电脑的石头剪刀布
        String[] result_string_new;                                     //存放结果文字

        Tom_buffer_new = swap(Tom_buffer, count);                       //将多余的数组删掉
        computer_buffer_new = swap(computer_buffer, count);
        result_string_new = swap(result_string, count);

        System.out.println("Tom\t\t\t电脑\t\t\t赢家");
        for (int j = 0;j < Tom_buffer_new.length;j ++) {
            System.out.println(Tom_buffer_new[j] + "\t\t\t" + computer_buffer_new[j] + "\t\t\t" + result_string_new[j]);
        }

    }

    //将数字转换为剪刀石头布
    public static String convert_to_string(int number) {
        switch (number) {
            case 0:
                return "石头";
            case 1:
                return "剪刀";
            case 2:
                return "布";
        }
        return "error";
    }

    //将剪刀石头布转为数字
    public static int convert_to_number(String str) {
        if ("石头".equals(str)) {
            return 0;
        } else if ("剪刀".equals(str)) {
            return 1;
        } else if ("布".equals(str)) {
            return 2;
        }
        return -1;
    }

    //将结果转为文字
    public static String convert_result(int number) {
        switch (number) {
            case 0:
                return "平局";
            case 1:
                return "电脑";
            case 2:
                return "Tom";
        }
        return "error";
    }

    //数组拷贝
    public static String[] swap(String[] x, int count) {
        String[] swapped = new String[count];
        System.arraycopy(x, 0, swapped, 0, count);
        return swapped;
    }
}

class caiquan {
    int computer_number;

    //0：石头；1：剪刀；2：布
    public int result(int number) {
        if (computer_number == 0) {
            if (number == 0) {
                return 0;
            } else if (number == 1) {
                return 1;
            } else {
                return 2;
            }
        } else if (computer_number == 1) {
            if (number == 0) {
                return 2;
            } else if (number == 1) {
                return 0;
            } else {
                return 1;
            }
        } else {
            if (number == 2) {
                return 0;
            } else if (number == 1) {
                return 2;
            } else {
                return 1;
            }
        }
    }
}