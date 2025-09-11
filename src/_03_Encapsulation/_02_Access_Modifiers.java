package _03_Encapsulation;

// Class demonstrating all access modifiers
class Parent {

    private int privateVar = 1;      // Only accessible within this class
    int defaultVar = 2;               // Accessible within same package
    protected int protectedVar = 3;   // Accessible in same package + subclasses
    public int publicVar = 4;         // Accessible everywhere

    // Method to show private variable (encapsulation example)
    public void showPrivate() {
        System.out.println("Private variable: " + privateVar);
    }
}

// Subclass in the same package
class ChildSamePackage extends Parent {

    public void showVars() {
        // System.out.println(privateVar); // Not accessible
        System.out.println("Default variable: " + defaultVar);       // Accessible
        System.out.println("Protected variable: " + protectedVar);   // Accessible
        System.out.println("Public variable: " + publicVar);         // Accessible
    }
}

// Subclass in a different package (you can imagine as another file/package)
class ChildDifferentPackage extends Parent {

    public void showVars() {
        // System.out.println(privateVar); // Not accessible
        // System.out.println(defaultVar); // Not accessible (different package)
        System.out.println("Protected variable: " + protectedVar); // Accessible via inheritance
        System.out.println("Public variable: " + publicVar);       // Accessible
    }
}

public class _02_Access_Modifiers {
    public static void main(String[] args) {

        Parent parent = new Parent();
        parent.showPrivate();  // Access private via public method
        System.out.println("Default variable: " + parent.defaultVar);
        System.out.println("Protected variable: " + parent.protectedVar);
        System.out.println("Public variable: " + parent.publicVar);

        System.out.println("\n---------- Child in same package ----------");
        ChildSamePackage child1 = new ChildSamePackage();
        child1.showVars();

        System.out.println("\n---------- Child in different package ----------");
        ChildDifferentPackage child2 = new ChildDifferentPackage();
        child2.showVars();
    }

}
