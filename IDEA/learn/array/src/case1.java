public class case1 {
    public static void main(String[] args) {
        char[] letters = new char[26];
        for (int i = 0; i < 26; i++) {
            letters[i] = (char) ('A' + i);
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(letters[i] + " ");
        }
    }
}
