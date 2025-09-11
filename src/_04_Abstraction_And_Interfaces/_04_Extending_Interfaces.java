package _04_Abstraction_And_Interfaces;

// Parent interface
interface InterfaceA {
    int varA = 10;  // Equivalent to: public static final int varA = 10;

    // Abstract method
    void methodA();
}

// Child interface extending InterfaceA
interface InterfaceB extends InterfaceA {

    // Interface constants
    boolean flagB = true; // Equivalent to: public static final boolean flagB = true;
    int varB = InterfaceA.varA * 7; // constants can be defined using other constants

    // Abstract method
    void methodB();
}

// Class implementing InterfaceB (also indirectly implements InterfaceA)
class classA implements InterfaceB {

    @Override
    public void methodB() {
        System.out.println("methodB from classA");
    }

    @Override
    public void methodA() {
        System.out.println("methodA from classA");
    }
}

public class _04_Extending_Interfaces {
    public static void main(String[] args) {

        classA a = new classA();

        // Calling implemented methods
        System.out.println("\n--- Methods from Interfaces ---");
        a.methodA();
        a.methodB();

        // Access constants via object (allowed but not recommended)
        System.out.println("\n--- Accessing constants via object ---");
        System.out.println(a.varA);
        System.out.println(a.flagB);
        System.out.println(a.varB);

        // Access constants via interface name (preferred way)
        System.out.println("\n--- Access constants via interface name ---");
        System.out.println(InterfaceA.varA);
        System.out.println(InterfaceB.flagB);
        System.out.println(InterfaceB.varB);

        // Note: constants belong to the INTERFACE, not the object.

    }
}
