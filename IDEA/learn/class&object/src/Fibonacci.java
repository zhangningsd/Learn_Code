public class Fibonacci {
    public static void main(String[] args) {
        T t = new T();
        //int a = t.getFibonacci(7);
        //System.out.println(a);
        int laat = t.eatPeach(1);
        System.out.println(laat);
    }
}

class T {
    public int getFibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }

    public int eatPeach(int day) {
        if (day == 10) {
            return 1;
        } else if (day >= 1 && day <= 9) {
            return (eatPeach(day + 1) + 1) * 2;
        }else {
            return 0;
        }

    }
}
