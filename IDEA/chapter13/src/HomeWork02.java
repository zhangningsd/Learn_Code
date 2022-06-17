import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {

        String user;
        String passwd;
        String email;
        String temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入用户名:");
        temp = scanner.next();
        if (temp.length() == 2 || temp.length() == 3 || temp.length() == 4) {
            user = temp;
        } else {
//            System.out.println("输入的用户名长度为2-4之间");
            throw new RuntimeException("输入的用户名长度为2-4之间");
        }
        System.out.print("输入密码:");
        temp = scanner.next();
        if (isDigital(temp) && temp.length() == 6) {
            passwd = temp;
        } else {
            throw new RuntimeException("密码应为纯数字");
        }
        System.out.print("输入邮箱:");
        temp = scanner.next();
        if (emailFormatCheck(temp)) {
            email = temp;
        } else {
            throw new RuntimeException("邮箱格式错误");
        }

    }

    public static boolean isDigital(String s) {
        try {
            int a = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
//            System.out.println("密码应为纯数字");
            return false;
        }
    }

    public static boolean emailFormatCheck(String s) {

        int indexAt = s.indexOf("@");
        int indexPoint = s.lastIndexOf(".");
        if (indexAt == -1 || indexPoint == -1) return false;
        return indexAt < indexPoint;
    }
}
