package _07_Inner_Classes;

interface Greeting {
    void sayHello();
}

public class _04_Anonymous_Class {
    public static void main(String[] args) {

        // Anonymous Inner Class: no class name, defined on-the-fly while creating object
        Greeting greet = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class!");
            }
        };

        greet.sayHello(); // Call method of anonymous class

        // Another instance with different implementation
        Greeting greet2 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hi there! Another anonymous greeting.");
            }
        };

        greet2.sayHello();

    }
}

// Anonymous Inner Class is a class without a name, defined and instantiated at the same time.
// Usually to provide a one-time implementation of an interface or extend a class.
// Often used for event handling, callbacks, or simple method overrides without creating a separate named class.