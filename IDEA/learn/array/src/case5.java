public class case5 {
    public static void main(String[] args) {

        int[] a = {24, 69, 80, 57, 13};
        for (int j = 0; j < a.length - 1; j++) {
            for (int i = 0; i < a.length - j - 1; i++) {
                int temp;
                if (a[i] > a[i + 1]) {
                    temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                }
            }
            display(a);
            System.out.println();
        }
        display(a);
    }

    private static void display(int[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }

}
