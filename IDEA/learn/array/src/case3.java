public class case3 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66};
        int[] arr_reverse = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr_reverse[i] = arr[arr.length - i - 1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr_reverse[i] + " ");
        }
    }
}
