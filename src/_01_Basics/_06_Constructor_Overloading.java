package _01_Basics;

// Mobile class demonstrating constructor overloading
class Mobile {

    // Fields
    String color;
    double price;
    boolean hasDualSIM;
    int storage;

    // Default constructor
    // Calls the 4-parameter constructor with default values
    public Mobile() {
        this("Unknown", 0.0, false, 0);
    }

    // Constructor with color and price
    public Mobile(String color, double price) {
        this(color, price, false, 0);
    }

    // Constructor with all fields
    public Mobile(String color, double price, boolean hasDualSIM, int storage) {
        this.color = color;
        this.price = price;
        this.hasDualSIM = hasDualSIM;
        this.storage = storage;
    }

    // Copy constructor
    public Mobile(Mobile other) {
        this(other.color, other.price, other.hasDualSIM, other.storage);
    }

    // Method to display Mobile details
    public void displayDetails() {
        System.out.println("Color: " + color +
                "\nPrice: " + price +
                "\nHas dual SIM? : " + hasDualSIM +
                "\nStorage: " + storage +
                "\n-----------------------------------");
    }
}

public class _06_Constructor_Overloading {
    public static void main(String[] args) {

        // Using default constructor
        Mobile m1 = new Mobile();
        m1.displayDetails();

        // Using 2-parameter constructor
        Mobile m2 = new Mobile("Blue", 45000);
        m2.displayDetails();

        // Using all-fields constructor
        Mobile m3 = new Mobile("Red", 55000, true, 128);
        m3.displayDetails();

        // Using copy constructor to create a new object from m3
        Mobile m4 = new Mobile(m3);
        System.out.println("COPIED MOBILE");
        m4.displayDetails();

    }
}
