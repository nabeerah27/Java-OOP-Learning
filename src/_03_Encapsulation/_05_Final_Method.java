package _03_Encapsulation;

// Parent class
class Vehicle {
    final String color; // final variable: cannot be reassigned after initialization

    public Vehicle(String color) {
        this.color = color; // final variable initialized via constructor
    }

    public final void start() { // final method: cannot be overridden by child classes
        System.out.println("Vehicle started...");
    }

    public void stop() { // normal method: can be overridden
        System.out.println("Vehicle stopped...");
    }
}

// Child class
class Bus extends Vehicle {

    public Bus(String color) {
        super(color); // call parent constructor to set color
    }

    /* Cannot override final method in parent
    @Override
    public void start() { } */

    @Override
    public void stop() { // overriding normal method
        System.out.println("Bus stopped...");
    }
}

public class _05_Final_Method {
    public static void main(String[] args) {

        System.out.println("========= Vehicle reference type =========");

        Vehicle vehicle = new Bus("Green"); // Vehicle reference, Bus object
        vehicle.start(); // calls final method from parent (cannot be overridden)
        vehicle.stop();  // calls overridden stop method from Bus
        // vehicle.color = "Brown"; -> ERROR: cannot reassign final variable
        System.out.println(vehicle.color); // can access final variable

        System.out.println("========= Bus reference type =========");

        Bus bus = new Bus("Blue"); // Bus reference
        bus.start(); // calls final method from parent
        bus.stop();  // calls overridden stop method from Bus
        // bus.color = "Red"; -> ERROR: cannot reassign final variable
        System.out.println(bus.color); // access final variable

    }
}
