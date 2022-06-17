import java.sql.Array;
import java.util.Arrays;

public class HomeWork04 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(count("asda8q9!@#$%^&*3huwjkaSFA221SDAad2")));
    }

    public static int[] count(String s) {
        int[] num = new int[4];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                num[0]++;
            } else if (chars[i] >= 'A' && chars[i] <= 'Z') {
                num[1]++;
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                num[2]++;
            } else {
                num[3]++;
            }
        }
        return num;
    }
}
