public class case2 {
    public static void main(String[] args) {
        int[] a = {4, -1, 9, 10, 2};
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    index = i;
                }else {
                    index = j;
                }
            }
        }
        System.out.println("最大值为：" + a[index] + "下标为:" + index);
    }
}
