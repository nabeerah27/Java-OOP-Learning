package _02_Static_Concepts;

// Only one object of Singleton exists.
class Singleton {

    // Create private static reference
    private static Singleton instance;

    // Make the constructor private
    private Singleton() {
        System.out.println("Singleton instance created!");
    }

    // Create a public static method to return the instance
    public static Singleton getInstance() {
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}

public class _05_Singleton_Class {
    public static void main(String[] args) {

        // Cannot create object directly due to private constructor
        // Singleton s = new Singleton(); // Not allowed

        // Both calls return the same object
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.showMessage();
        s2.showMessage();

        // Check if both references point to the same object
        System.out.println(s1 == s2); // true

    }
}
