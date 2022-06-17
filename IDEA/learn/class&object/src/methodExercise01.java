public class methodExercise01 {
    public static void main(String[] args) {
        AA a = new AA();
        BB b = new BB();
        b.age = 16;
        if (a.isOdd(5)) {
            System.out.println("是奇数");

        }else {
            System.out.println("是偶数");
        }

        a.printChar(10, 10, '#');
    }
}

class AA {
    String name;
    int age;
    public boolean isOdd(int n) {
        return n % 2 != 0;
    }

    public void printChar(int row, int col, char c) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

class BB extends AA {

}