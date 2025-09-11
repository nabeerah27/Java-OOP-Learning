package _05_Inheritance;

// Parent class
class Library {
    void open() {
        System.out.println("Library is open for reading books.");
    }
}

// Child class
class DigitalLibrary extends Library {

    @Override
    void open() {
        System.out.println("Digital Library is open for eBooks and Journals.");

        // Call parent version of open()
        super.open();
    }
}

public class _03_Super_In_Methods {
    public static void main(String[] args) {

        DigitalLibrary dl = new DigitalLibrary();
        dl.open();   // Calls both child and parent versions

    }
}
