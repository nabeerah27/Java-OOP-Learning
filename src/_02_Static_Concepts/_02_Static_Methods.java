package _02_Static_Concepts;

// Utility class for math operations
// Demonstrates static methods (can be called without creating objects)
class MathUtils {

    // Static method to calculate square of a number
    static int square(int x) {
        return x * x;  // multiply the number by itself
    }

    // Static method to return the maximum of two numbers
    static int max(int a, int b) {
        if(a > b)
            return a;  // return a if it is greater
        else
            return b;  // otherwise return b
    }
}

public class _02_Static_Methods {
    public static void main(String[] args) {

        // Call static methods using class name
        System.out.println(MathUtils.square(7));
        System.out.println(MathUtils.max(-45, 98));

        // Note: No object of MathUtils is needed to call static methods

    }
}
