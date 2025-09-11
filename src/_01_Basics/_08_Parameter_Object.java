package _01_Basics;

class Book {
    String title;
    String author;
    int year;

    // Parameterized Constructor
    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // Method to display book details
    void display() {
        System.out.println("Title: " + title +
                           "\nAuthor: " + author +
                           "\nYear: " + year);
    }
}

class BookFinder {

    // Method that takes a Book object as parameter
    void findBook(Book book) {
        System.out.println("Book found:");
        book.display(); // Call Book's method using the object
    }
}

// Demonstrate passing an object as a parameter using Book
public class _08_Parameter_Object {
    public static void main(String[] args) {

        // Create some Book objects
        Book b1 = new Book("Effective Java", "Joshua Bloch", 2018);
        Book b2 = new Book("Code Complete", "Steve McConnell", 2004);

        // Create a BookFinder object
        BookFinder library = new BookFinder();

        // Pass Book objects to the Library method
        library.findBook(b1);
        library.findBook(b2);

    }
}
