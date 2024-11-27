
package day10;


public class Book {

    // Default constructor that initializes fields with default values.
    // Constructor with title and author.
    // Constructor with title, author, and price.
    // Constructor with all fields (title, author, price, and publicationYear).

    private String title;
    private String author;
    private double price;
    private int publicationYear;

    public Book () {

    }

    public Book (String title, String author) {
        this(title, author, 50.20, 2001);
    }

    public Book (String title, String author, double  price){
        this(title, author, price, 1990);
    }

    public Book (String title, String author, double price, int publicationYear) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publicationYear = publicationYear;
    }

    public void displayPakMir() {
        System.out.println("title: " + this.title);
        System.out.println("author: " + this.author);
        System.out.println("price: " + this.price);
        System.out.println("publicYear: " + this.publicationYear);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
    }

    public static void main(String[] args) {
            Book defaultCron = new Book();
            defaultCron.displayPakMir();

            Book titleAuthor = new Book("Clean Code", "Pak Mir");
            titleAuthor.displayPakMir();

            Book titleAuthorPrice = new Book("Dead Soul", "Pak Jamal", 50.200);
            titleAuthorPrice.displayPakMir();

            Book allCron = new Book("YOLO", "PAK PANDIR", 100.20, 1945);
            allCron.displayPakMir();
            
    }
}
