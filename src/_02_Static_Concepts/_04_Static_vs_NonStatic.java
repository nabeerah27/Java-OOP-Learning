package _02_Static_Concepts;

// Demo class to show static vs non-static behavior
class Demo {

    // Static method: belongs to the class
    static void staticMethod() {
        System.out.println("I am a STATIC method");
    }

    // Non-static method: belongs to an object
    void nonStaticMethod() {
        System.out.println("I am a NON-STATIC method");

        // Static method can be called directly inside non-static method
        staticMethod();
    }

    // Another static method
    static void anotherStatic() {
        System.out.println("Inside another STATIC method");

        // Can call static method directly
        staticMethod();

        // Cannot call non-static method directly (would cause error)
        // nonStaticMethod(); // Error

        // Need an object to call non-static method
        Demo obj = new Demo();
        obj.nonStaticMethod();
    }
}

public class _04_Static_vs_NonStatic {
    public static void main(String[] args) {

        // Calling static method using class name – no object needed
        Demo.staticMethod();

        // Calling non-static method requires an object
        Demo d = new Demo();
        d.nonStaticMethod();

        // Static method calling non-static method via object
        Demo.anotherStatic();

    }
}
