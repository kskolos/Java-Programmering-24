public class E3_Exercises {

    public class Book {
    String title;
    String author;
    private int year;

    public Book() {
        title = "A New Beginning";
        author = "Maria Day";
        year = 2003;
    }
}

public static void main(String[] args) {

    Book newBook = new Book();

    System.out.println(newBook.title);

 }
}
