import java.util.Arrays;

public class HomeWork01 {
    public static void main(String[] args) {
        //abcdef -> aedcbf  1-4
        try {
            System.out.println(reverse("abcdefsdffa", 1, 30));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String reverse(String str, int start, int end) {

        if (!(str != null && start >= 0 && end > start && end < str.length() - 1)) {
            throw new RuntimeException("参数不正确");
        }



//        StringBuilder stringBuilder1 = new StringBuilder(str);
//        StringBuilder stringBuilder2 = new StringBuilder();
//        stringBuilder2.append(stringBuilder1, 0, start);
//        for (int i = start; i <= end; i++) {
//            stringBuilder2.append(stringBuilder1.charAt(end - i + 1));
//        }
//        stringBuilder2.append(stringBuilder1, end + 1, stringBuilder1.length());
//        return stringBuilder2.toString();

        char[] chars = str.toCharArray();
//        for (int i = start; i <= end / 2; i++) {
//            char c = chars[i];
//            chars[i] = chars[end - i + 1];
//            chars[end - i + 1] = c;
//        }
//        return new String(chars);
        char temp;
        for (int i = start, j = end; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}
