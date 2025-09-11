package _05_Inheritance;

// Parent class
class Vehicle {
    String brand = "Generic Vehicle";

    void start() {
        System.out.println(brand + " is starting...");
    }
}

// Child class 1
class Car extends Vehicle {
    int doors = 4;

    void drive() {
        System.out.println(brand + " car with " + doors + " doors is driving...");
    }
}

// Child class 2
class Bike extends Vehicle {
    boolean hasGear = true;

    void ride() {
        System.out.println(brand + " bike (gear: " + hasGear + ") is riding...");
    }
}

// Child class 3
class Truck extends Vehicle {
    int capacity = 5000; // in kg

    void load() {
        System.out.println(brand + " truck with capacity " + capacity + "kg is loading goods...");
    }
}

public class _06_Hierarchical_Inheritance {
    public static void main(String[] args) {

        // Car object
        Car car = new Car();
        car.brand = "Toyota";
        car.start();   // from Vehicle
        car.drive();   // from Car

        System.out.println("--------------------------------");

        // Bike object
        Bike bike = new Bike();
        bike.brand = "Honda";
        bike.start();  // from Vehicle
        bike.ride();   // from Bike

        System.out.println("--------------------------------");

        // Truck object
        Truck truck = new Truck();
        truck.brand = "Volvo";
        truck.start(); // from Vehicle
        truck.load();  // from Truck

    }
}

// Hierarchical Inheritance
// When multiple classes inherit from the same parent class. (One parent → many children)
