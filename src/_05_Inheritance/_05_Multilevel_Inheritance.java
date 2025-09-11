package _05_Inheritance;

// Base class (Grandparent)
class Animal {
    String type = "Animal"; // Variable in Animal

    void eat() {
        System.out.println(type + " is eating...");
    }
}

// Intermediate class (Parent)
class Dog extends Animal {
    String breed = "German Shepherd"; // Variable in Dog

    void bark() {
        System.out.println(breed + " is barking...");
    }
}

// Child class
class Puppy extends Dog {
    int age = 1; // Variable in Puppy

    void weep() {
        System.out.println("Puppy of age " + age + " is weeping...");
    }
}

public class _05_Multilevel_Inheritance {
    public static void main(String[] args) {

        // Create Puppy object
        System.out.println("Reference and object type -> Puppy (child class)");
        Puppy puppy = new Puppy();

        // Access inherited methods
        System.out.println("\n--- Accessing parent's methods ---");
        puppy.eat();   // From Animal
        puppy.bark();  // From Dog
        puppy.weep();  // From Puppy

        // Access variables from all levels
        System.out.println("\n--- Accessing variables from inheritance chain ---");
        System.out.println("Type: " + puppy.type);      // from Animal
        System.out.println("Breed: " + puppy.breed);    // from Dog
        System.out.println("Age: " + puppy.age);        // from Puppy

        System.out.println("Reference and object type -> Puppy (child class)");
        Animal animal = new Animal();

        animal.eat();
        // animal.bark(); -> ERROR: can't access child-specific methods

        System.out.println(animal.type);
        // System.out.println(animal.age); -> ERROR: can't access child-specific variables

    }
}

// Multilevel Inheritance
// When a class inherits from another class, which itself is also a child of another class.
// Grandparent → Parent → Child
