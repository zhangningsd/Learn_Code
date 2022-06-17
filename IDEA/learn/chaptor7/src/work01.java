public class work01 {
    public static void main(String[] args) {
        A01 a = new A01();
        double[] x = {1.0, 23.9, 12.9, 8, -12.4, 4};
        double max = a.getMax(x);
        System.out.println(max);
    }
}

class A01 {
    public double getMax(double[] x) {
        double max = x[0];
        for (int i = 0; i< x.length; i++) {
            if (max < x[i]) {
                max = x[i];
            }
        }
        return max;
    }
}
