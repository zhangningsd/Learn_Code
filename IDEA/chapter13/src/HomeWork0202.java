public class HomeWork0202 {
    public static void main(String[] args) {
        String name = "zn";
        String passwd = "123435";
        String email = "2389963122@qq。com";

        try {
            userRegister(name, passwd, email);
            System.out.println("注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void userRegister(String name, String passwd, String email) {
        int userLength = name.length();
        if (!(userLength >= 2 && userLength <= 4)) {
            throw new RuntimeException("输入的用户名长度为2-4之间");
        }

        if (!(passwd.length() == 6 && isDigital(passwd))) {
            throw new RuntimeException("密码应为6位纯数字");
        }

        int i = email.indexOf('@');
        int j = email.lastIndexOf('.');
        if (!(i > 0 && j > i)){
            throw new RuntimeException("邮箱格式不正确");
        }
    }

    public static boolean isDigital(String s) {
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            if (aChar < '0' || aChar > '9') {
                return false;
            }
        }
        return true;
    }

}
