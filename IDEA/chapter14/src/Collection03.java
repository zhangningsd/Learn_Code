import java.util.*;

public class Collection03 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
//        List list = new LinkedList();
//        List list = new Vector();
        list.add(new Book("红楼梦", "曹雪芹", 100));
        list.add(new Book("西游记", "吴承恩", 80));
        list.add(new Book("三国演义", "罗贯中", 90));
        list.add(new Book("水浒传", "施耐庵", 70));
        list.add(new Book("西游记", "吴承恩", 80));

//        list.sort(new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Book book1 = (Book) o1;
//                Book book2 = (Book) o2;
//                if (book1.getPrice() > book2.getPrice()) {
//                    return 1;
//                } else if (book1.getPrice() < book2.getPrice()){
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }

        for (Object o :list) {
            System.out.println(o);
        }
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

