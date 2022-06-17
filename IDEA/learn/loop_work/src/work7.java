public class work7 {
    public static void main(String[] args) {
        for (int i = 97; i <= 122; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
        for (int i = 97, j = 7; i <= 122 && j <= 57; i++, j += 2) {
            System.out.print((char) (i -j) + " ");
        }
    }
}
