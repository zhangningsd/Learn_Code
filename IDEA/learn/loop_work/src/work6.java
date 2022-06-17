import java.util.concurrent.atomic.AtomicInteger;

public class work6 {
    public static void main(String[] args) {
        AtomicInteger counter = new AtomicInteger();
        for (int i = 0; i <= 100; i++) {
            if (i % 5 != 0) {
                System.out.print(i + " \t");
                counter.getAndIncrement();
                if(counter.get() == 5){
                    System.out.println();
                    counter.set(0);
                }
            }
        }
    }
}
