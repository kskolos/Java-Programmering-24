public class Book {
    String title;
    int year;

    Book() {
        title = "default";
        year = 0000;
    }

public static void main(String[] args) {
    Book book = new Book();
    System.out.println(book.title);
    }
}