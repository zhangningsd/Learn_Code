public class methodDetail {
    public static void main(String[] args) {

        plus_div a = new plus_div();
        a.getSumAndSub(1, 4);

        System.out.println(a.plus);
        System.out.println(a.div);

    }
}

class plus_div {
    int plus;
    int div;

    private void ab(){

    }

    public void getSumAndSub(int a, int b) {
        ab();
        plus = a + b;
        div = a - b;
    }
}