public class suijishu {
    public static void main(String[] args) {

        int count = 0;
        for (;;){
            int number = (int) (Math.random() * 100) + 1;
            if(number == 97){
                break;
            }
            count++;
        }
        System.out.println(count);
    }
}
