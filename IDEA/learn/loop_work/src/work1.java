import java.util.concurrent.atomic.AtomicInteger;

public class work1 {
    public static void main(String[] args) {
        double money;
        money = 100000.0;
        AtomicInteger corner = new AtomicInteger();

        while(true){
            if(money > 50000){
                money = money - money * 0.05;
            }else if (money>=1000){
                money = money - 1000;
            }else {
                break;
            }
            corner.getAndIncrement();

        }
        System.out.print(corner.get());
    }
}