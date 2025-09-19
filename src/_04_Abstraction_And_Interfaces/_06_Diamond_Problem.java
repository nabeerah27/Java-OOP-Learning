package _04_Abstraction_And_Interfaces;

// Diamond Problem Example with Interfaces

// Interface A with a default method
interface A {
    default void show() {
        System.out.println("Default method from Interface A");
    }
}

// Interface B with the SAME default method
interface B {
    default void show() {
        System.out.println("Default method from Interface B");
    }
}

// ClassC implements both interfaces
// This causes a DIAMOND PROBLEM because both A and B have 'show()' default method
class ClassC implements A, B {

    // Java forces us to override show() to resolve the conflict
    @Override
    public void show() {
        System.out.println("Overriding to resolve conflict");

        // We can still call specific interface implementations if needed
        A.super.show(); // Calls show() from A
        B.super.show(); // Calls show() from B
    }
}

public class _06_Diamond_Problem {
    public static void main(String[] args) {

        ClassC c = new ClassC();
        c.show(); // Resolves conflict by using overridden method

    }
}

// The Diamond Problem occurs when a class inherits from multiple sources (like interfaces)
// that provide the same method implementation, creating ambiguity.
// In Java, if two interfaces define the same default method,
// the implementing class must override it to resolve the conflict.
