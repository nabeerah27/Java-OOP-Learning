package _04_Abstraction_And_Interfaces;

// Abstract base class (cannot be instantiated directly)
abstract class Animal {
    String name;

    // Constructor to initialize name
    Animal(String name) {
        this.name = name;
    }

    // Abstract method (no body here) → must be implemented in child classes
    abstract void sound();

    // Concrete method (already implemented) → can be directly used by subclasses
    void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

// Subclass Cat extending Animal
class Cat extends Animal {

    // Pass name to parent constructor
    Cat(String name) {
        super(name);
    }

    // Implement abstract method
    @Override
    void sound() {
        System.out.println(name + " says: Meow Meow");
    }
}

// Subclass Dog extending Animal
class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    // Implement abstract method
    @Override
    void sound() {
        System.out.println(name + " says: Woof Woof");
    }
}

public class _01_Abstract_Class {
    public static void main(String[] args) {

        // Animal a = new Animal("Any"); -> ERROR: Cannot create object of abstract class

        // Create objects of Cat and Dog but reference type is Animal (polymorphism)
        Animal cat = new Cat("Kitty");
        Animal dog = new Dog("Tommy");

        // Runtime polymorphism → sound() will call the version in the actual object
        cat.sound();
        dog.sound();

        // Inherited concrete method from Animal (parent class)
        cat.sleep();
        dog.sleep();

    }
}
