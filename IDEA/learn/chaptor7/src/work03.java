import java.util.Scanner;
public class work03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int price = scanner.nextInt();
        Book book = new Book(price);
        book.updatePrice();
        System.out.println(book.price);
    }
}

class Book {
    int price;

    public Book(int price) {
        this.price = price;
    }

    public void updatePrice(){
        if (this.price > 150) {
            this.price = 150;
        }else if (this.price > 100) {
            this.price = 100;
        }
    }
}
