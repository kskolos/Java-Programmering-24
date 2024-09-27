public class Book {
    String title;
    int year;
    String author;

    Book() {
        title = "default";
        year = 1997;
        author = "FirstName LastName";
    }

public static void main(String[] args) {
    Book book = new Book();
    System.out.println(book.title);
    System.out.println(book.year);
    System.out.println(book.author);
    }
}