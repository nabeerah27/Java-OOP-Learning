package _06_Polymorphism;

class Vehicle {
    void start() {
        System.out.println("Vehicle started..");
    }
}

class Bike extends Vehicle {
    void stop() {
        System.out.println("Bike stopped..");
    }
}

public class _04_DownCasting {
    public static void main(String[] args) {

        // Upcasting (safe) -> Bike object referred by Vehicle reference
        Vehicle v1 = new Bike();
        v1.start();
        //  vehicle.stop(); --> give error because stop() is the method of Bike not Vehicle

        //  Safe Down-casting using instanceof
        if (v1 instanceof Bike) {
            Bike bike = (Bike) v1;
            bike.stop();  // Child method
            bike.start(); // Parent method
        }

        // Unsafe Down-casting (causes ClassCastException)
        Vehicle v2 = new Vehicle(); // Pure Vehicle object
        if (v2 instanceof Bike)
        {
            Bike b2 = (Bike) v2; // Won't run, instanceof prevents crash
            b2.stop();
        }
        else
        {
            System.out.println("v2 is not a Bike, cannot downcast!");
        }
    }
}

// Down-casting is converting parent reference to child reference.
// Allows access to child-specific methods & variables.
// Must be done explicitly: (Child) parentRef.
// Unsafe if object is not actually child → ClassCastException.

// instanceof Keyword is used to check actual object type at runtime.
// Returns true if object belongs to given class (or subclass).
// Commonly used before down-casting to ensure safety.
// Prevents ClassCastException.
