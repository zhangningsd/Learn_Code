public class work8 {
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                sum = sum - (1.0 / i);
            }else {
                sum = sum + (1.0 /i);
            }
        }
        System.out.println(sum);
    }
}
