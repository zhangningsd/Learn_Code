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
            System.out.println("һ�����λ���");
            System.out.println("��������");
            String name = scanner.next();
            System.out.println("��������");
            String password = scanner.next();
            if(name.equals("����") && password.equals("666")){
                System.out.println("��¼�ɹ�");
                break;
            }else{
                System.out.println("����" + (2-i) + "�λ���");
            }

        }
        scanner.close();
    }
}