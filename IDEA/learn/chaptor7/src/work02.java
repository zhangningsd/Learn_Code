public class work02 {
    public static void main(String[] args) {
        String[] str = {"QWE", "ASD", "ZXC", "ERT"};
        A02 a = new A02();
        int index = a.find(str, "ASD");
        System.out.println(index);
    }
}

class A02 {
    public int find(String[] x, String n) {
        for (int i = 0; i < x.length; i++) {
            if (n.equals(x[i])) {
                return i;
            }
        }
        return -1;
    }
}