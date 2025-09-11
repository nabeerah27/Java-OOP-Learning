package _01_Basics;

// Library class demonstrating copy constructor with array of Book objects
class Library {

    int libraryId;    // primitive field
    Book[] books;     // mutable reference field (array of Book)

    // Parameterized constructor
    public Library(int libraryId, Book[] books) {
        this.libraryId = libraryId;
        this.books = books;
    }

    // Copy constructor
    public Library(Library other, boolean shallow) {
        this.libraryId = other.libraryId; // primitive copied by value

        if (shallow)
        {
            // Shallow copy: just copy the reference of the array
            this.books = other.books;
        }
        else
        {
            // Deep copy: create new array and copy each Book object
            this.books = new Book[other.books.length];
            for (int i = 0; i < other.books.length; i++)
            {
                Book b = other.books[i];
                this.books[i] = new Book(b.title, b.author, b.year); // create new Book objects
            }
        }
    }

    // Display method
    public void display() {
        System.out.println("Library ID: " + libraryId);
        System.out.println("Books in library!");

        for (Book book : books)
        {
            book.display();
            System.out.println("-------------------");
        }
    }
}

public class _05_Shallow_Deep_Copy {
    public static void main(String[] args) {

        // Create some books
        Book b1 = new Book("It ends", "Emily Suvada", 2015);
        Book b2 = new Book("Animal Farm", "George Orwell", 1945);
        Book[] bookArray = {b1, b2}; // store Book objects in an array

        // Original library
        Library original = new Library(101, bookArray);
        System.out.println("..........Original Library ..........");
        original.display();

        // Shallow copy
        Library shallowCopy = new Library(original, true);
        System.out.println("\n..........Shallow Copy..........");
        shallowCopy.display();

        // Modify shallow copy
        shallowCopy.libraryId = 102;  // primitive change

        shallowCopy.books[0].title = "The Glass Code";
        shallowCopy.books[1].year = 1938;

        System.out.println("\n..........After modifying Shallow copy..........");
        shallowCopy.display();
        System.out.println("\nOriginal Library:"); // affected in books but not libraryId
        original.display();

        // Deep copy
        Library deepCopy = new Library(original, false);
        System.out.println("\n..........Deep Copy..........");
        deepCopy.display();

        // Modify deep copy
        deepCopy.libraryId = 103;

        deepCopy.books[0].year = 2018;
        deepCopy.books[1].title = "Homage to Catalonia";

        System.out.println("\n..........After modifying Deep Copy..........");
        deepCopy.display();
        System.out.println("\nOriginal Library:"); // unchanged
        original.display();

    }
}
