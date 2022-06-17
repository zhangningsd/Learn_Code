import java.util.Scanner;
public class breakexercise{
    public static void main(String [] args){
        
        int sum = 0;
        for(int i = 1;i <= 100;i++){
            sum += i;
            if(sum > 20){
                System.out.println(i);
                break;
            }
        }

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3;i++){
            System.out.println("一共三次机会");
            System.out.println("输入名字");
            String name = scanner.next();
            System.out.println("输入密码");
            String password = scanner.next();
            if(name.equals("丁真") && password.equals("666")){
                System.out.println("登录成功");
                break;
            }else{
                System.out.println("还有" + (2-i) + "次机会");
            }

        }
        scanner.close();
    }
}