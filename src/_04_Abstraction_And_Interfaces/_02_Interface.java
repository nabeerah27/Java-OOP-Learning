package _04_Abstraction_And_Interfaces;

// Interface → defines a contract (only method signatures, no implementation)
// Every method in an interface is implicitly:
// - public
// - abstract (before Java 8)
// Every variable here is implicitly: public, static, final.

interface Vehicle {

    int MAX_SPEED = 180; // constant variable (must be initialized)

    void start();   // abstract method
    void stop();    // abstract method
}

// Implementing interface
class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car starts with key ignition. Max speed allowed: " + MAX_SPEED);
    }

    @Override
    public void stop() {
        System.out.println("Car stops with hydraulic brakes.");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with self-start button. Max speed allowed: " + MAX_SPEED);
    }

    @Override
    public void stop() {
        System.out.println("Bike stops with disc brakes.");
    }
}

public class _02_Interface {
    public static void main(String[] args) {

        // Interface reference → can hold object of implementing class (Polymorphism)
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        // Calls overridden methods of actual object
        car.start();
        car.stop();

        bike.start();
        bike.stop();

        // Accessing variable directly from interface
        System.out.println("Vehicle max speed (from interface constant): " + Vehicle.MAX_SPEED);

    }
}
