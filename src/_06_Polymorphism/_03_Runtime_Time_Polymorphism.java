package _06_Polymorphism;

// Parent class
class Animal {
    String type = "Generic Animal"; // variable in parent

    void sound() {
        System.out.println("Some generic sound");
    }
}

// Child class Cat
class Cat extends Animal {
    String type = "Cat"; // hides parent's variable

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Child class Dog
class Dog extends Animal {
    String type = "Dog"; // hides parent's variable

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class _03_Runtime_Time_Polymorphism {
    public static void main(String[] args) {

        // Parent reference but child object (Upcasting)
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();

        System.out.println("===== PARENT reference type & CHILD object type =====");
        System.out.println("\n----- Method Calls (Runtime Polymorphism) -----");
        animal1.sound(); // Cat's sound
        animal2.sound(); // Dog's sound

        System.out.println("\n----- Variable Access -----");
        System.out.println("animal1.type: " + animal1.type); // Generic Animal
        System.out.println("animal2.type: " + animal2.type); // Generic Animal

        // Child references
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println("\n===== CHILD Reference type & CHILD object type =====");
        System.out.println("\n------ Method Calls -----");
        cat.sound(); // Cat meows
        dog.sound(); // Dog barks

        System.out.println("\n----- Variable Access -----");
        System.out.println("cat.type: " + cat.type); // Cat
        System.out.println("dog.type: " + dog.type); // Dog

    }
}

// Achieved through method overriding (same method name & parameters in parent and child).
// Methods -> Resolved at RUNTIME (depends on OBJECT type). This is true polymorphism.
// Variables -> Resolved at COMPILE TIME (depends on REFERENCE type). This is called variable hiding.
// Runtime Polymorphism is also known as Dynamic Method Dispatch.
// Useful for achieving loose coupling and code reusability.
