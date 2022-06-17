public class work04 {
    public static void main(String[] args) {
        A03 a = new A03();
        int[] array = {12, 43, 345, 758494, 122, 23};
        int[] array_copy = a.copyArray(array);
        for (int i = 0; i < array_copy.length; i++) {
            System.out.print(array_copy[i] + " ");
        }
    }
}

class A03 {
    public int[] copyArray(int[] array) {
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        return arr;
    }
}