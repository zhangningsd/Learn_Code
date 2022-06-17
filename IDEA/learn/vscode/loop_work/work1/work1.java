package loop_work.work1;

public class work1 {
    public static void main(String[] args) {
        double money = 100000.0;
        int corner = 0;

        while(true){
            if(money > 50000){
                money = money - money * 0.05;
            }else{
                money = money - 1000;
            }
            corner++;
            if(money < 0){
                break;
            }
        }
        System.out.print(corner);
    }
}
