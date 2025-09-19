package _07_Inner_Classes;

// Class to demonstrate Local Inner Class
class MathHelper {

    // Method containing a local inner class
    void multiplyNumbers(double a, double b) {

        // Local inner class is defined inside a method
        class Multiplier {

            // Method to multiply two numbers
            double multiply(double n1, double n2) {
                return n1 * n2;
            }
        }

        // Create object of local inner class
        Multiplier multiplier = new Multiplier();
        double result = multiplier.multiply(a, b);

        // Print the result
        System.out.println("Multiplication of " + a + " and " + b + " = " + result);

    }
}

public class _03_Local_Inner_Class {
    public static void main(String[] args) {

        // Create outer class object
        MathHelper helper = new MathHelper();

        // Call method which internally uses local inner class
        helper.multiplyNumbers(4.5, 7.7);

    }
}

// Local inner class is a class defined inside a method of another class.
// Its scope is limited to the method it is defined in (cannot be instantiated outside that method).
// It can access the method’s final or effectively final variables, and all members (fields and methods) of the outer class.
// Useful for temporary tasks where a class is needed only within a single method.