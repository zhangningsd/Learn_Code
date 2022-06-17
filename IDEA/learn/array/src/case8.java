public class case8 {
    public static void main(String[] args) {
        int max = 100, min = 1;
        int[] random = new int[10];
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * (max - min) + min);
        }

        System.out.println("原始数组：");
        display(random);
        System.out.println();
        bubblesort(random);
        System.out.println("排序后数组：");
        display(random);
        System.out.println();
        System.out.println("倒序数组：");
        display_reversed(random);
        int[] Max = get_max(random);
        boolean flag = find_8(random);

        System.out.println();
        System.out.println("平均值为" + get_average(random));
        System.out.println("最大值为：" + Max[0] + "下标为:" + Max[1]);
        if (flag) {
            System.out.println("包含8");
        } else {
            System.out.println("不包含8");
        }

    }

    public static void display(int[] x) {
        for (int j : x) {
            System.out.print(j + " ");
        }
    }

    public static void display_reversed(int[] x) {
        for (int i = x.length - 1; i >= 0; i--) {
            System.out.print(x[i] + " ");
        }
    }

    public static void bubblesort(int[] a) {
        for (int j = 0; j < a.length - 1; j++) {
            for (int i = 0; i < a.length - j - 1; i++) {
                int temp;
                if (a[i] > a[i + 1]) {
                    temp = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    public static double get_average(int[] x) {
        double sum = 0.0;
        for (int j : x) {
            sum = sum + j;
        }
        return (sum / x.length);
    }

    public static int[] get_max(int[] x) {
        int max = x[0];
        int index = 0;

        for (int i = 1; i < x.length; i++) {
            if (max < x[i]) {
                max = x[i];
                index = i;
            }
        }
        return new int[]{max, index};
    }

    public static boolean find_8(int[] x) {
        for (int j : x) {
            return j == 8;
        }
        return false;
    }
}
