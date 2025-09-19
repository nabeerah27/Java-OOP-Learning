package _07_Inner_Classes;

class Car {

    double price;
    private String model = "Tesla";
    static int noOfWheels = 4;

    public Car(double price) {
        this.price = price;
    }

    // Member (Non-static) Inner Class
    class Engine {
        void displayInfo() {
            System.out.println("Model: " + model);  // Access private outer field
            System.out.println("Price: $" + price); // Access outer instance field
            System.out.println("Number of wheels: " + noOfWheels); // Access static field
        }

        void startEngine() {
            System.out.println(model + "'s engine started!");
        }
    }

    // Method inside outer class to use inner class
    void showEngine() {
        Engine engine = new Engine();
        engine.displayInfo();
        engine.startEngine();
    }
}

public class _01_Member_Class {
    public static void main(String[] args) {

        Car car = new Car(195000);

        // Using inner class directly
        Car.Engine engine = car.new Engine();
        engine.displayInfo();
        engine.startEngine();

        System.out.println("\n--- Using outer class method to access inner class ---");
        car.showEngine();  // Shows inner class usage from outer class

    }
}

// Member (non-static) inner class is a class defined inside another class.
// It cannot have static members, except constants.
// It has access to all members of the outer class, including private fields and methods.
// To create an instance, you need an object of the outer class: Outer.Inner inner = outer.new Inner();
