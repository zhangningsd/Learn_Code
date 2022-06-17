public class work08 {
    int count = 9;

    public void count1() {
        count = 10;
        System.out.println("count1 = " + count);
    }

    public void count2() {
        System.out.println("count1 = " + count++);
    }

    public static void main(String[] args) {
        new work08().count1();
        work08 work = new work08();
        work.count2();
        work.count2();
    }
}
