package _04_Abstraction_And_Interfaces;

class OuterClass {
    // Nested interface inside a class
    interface InnerInterface {
        void display(); // abstract method
    }
}

// Class implementing nested interface inside OuterClass
class Implementer implements OuterClass.InnerInterface {
    @Override
    public void display() {
        System.out.println("Implementation of InnerInterface inside OuterClass");
    }
}

interface OuterInterface {
    void outerMethod();

    // Nested interface inside another interface
    interface InnerInterface {
        void innerMethod(); // abstract method
    }
}

// Class implementing nested interface inside OuterInterface
class Class implements OuterInterface.InnerInterface {
    @Override
    public void innerMethod() {
        System.out.println("InnerInterface method implemented!");
    }
}

public class _05_Nested_Interface {
    public static void main(String[] args) {

        // Interface inside a class
        OuterClass.InnerInterface obj1 = new Implementer();
        obj1.display();  // Output: Implementation of InnerInterface inside OuterClass

        // Interface inside another interface
        OuterInterface.InnerInterface obj2 = new Class();
        obj2.innerMethod();  // Output: InnerInterface method implemented!

        // Note: Nested interfaces are accessed using OuterClass.InnerInterface
        //       or OuterInterface.InnerInterface

    }
}
