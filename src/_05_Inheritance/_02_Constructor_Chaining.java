package _05_Inheritance;

// Parent class A
class A {

    A(String msg) {
        System.out.println("Constructor of A: " + msg);
    }
}

// Child class B extends A
class B extends A {

    B(String msg) {
        super("Hello from A");   // calls constructor of A
        System.out.println("Constructor of B: " + msg);
    }
}

// Child class C extends B
class C extends B {

    C(String msg) {
        super("Hello from B");   // calls constructor of B (which in turn calls A)
        System.out.println("Constructor of C: " + msg);
    }
}

public class _02_Constructor_Chaining {
    public static void main(String[] args) {

        A a = new A("Object of A");
        System.out.println("---------------------------------");

        B b = new B("Object of B");
        System.out.println("---------------------------------");

        C c = new C("Object of C");

    }
}

// constructor chaining:
// From child → parent → grandparent (C → B → A).
// The chain is built using super(...) calls.
