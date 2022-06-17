import java.util.Locale;

public class HomeWork03 {
    public static void main(String[] args) {
        System.out.println(formatName("Han shun Ping"));
        System.out.println(formatName("Willian Jefferson Clinton"));
    }

    public static String formatName(String s) {
        String[] newString = s.split(" ");
        return newString[2] + ',' + newString[0] + '.' + newString[1].toUpperCase().charAt(0);
    }

}
