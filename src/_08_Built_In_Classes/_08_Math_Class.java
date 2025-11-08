package _08_Built_In_Classes;

public class _08_Math_Class {
    public static void main(String[] args) {

        // Basic Operations
        int a = 10, b = 3;
        System.out.println("Max of a and b: " + Math.max(a, b)); // maximum
        System.out.println("Min of a and b: " + Math.min(a, b)); // minimum
        System.out.println("Absolute value of -10: " + Math.abs(-10)); // absolute

        // Power and Square Root
        double num = 16;
        System.out.println("Square root of 16: " + Math.sqrt(num));
        System.out.println("2 raised to power 5: " + Math.pow(2, 5));

        // Rounding
        double x = 7.3, y = 7.8;
        System.out.println("Ceil of 7.3: " + Math.ceil(x));   // rounds up
        System.out.println("Floor of 7.8: " + Math.floor(y)); // rounds down
        System.out.println("Round of 7.3: " + Math.round(x)); // rounds to nearest

        // Random Numbers
        double randomValue = Math.random(); // 0.0 <= random < 1.0
        System.out.println("Random number between 0 and 1: " + randomValue);
        int randomInt = (int)(Math.random() * 100) + 1; // random between 1 and 100
        System.out.println("Random integer between 1 and 100: " + randomInt);

        // Trigonometric Functions (in radians)
        double angle = Math.PI / 4; // 45 degrees
        System.out.println("sin(45°): " + Math.sin(angle));
        System.out.println("cos(45°): " + Math.cos(angle));
        System.out.println("tan(45°): " + Math.tan(angle));

        // Exponential and Logarithmic
        System.out.println("e^2: " + Math.exp(2));
        System.out.println("Natural log of 7.389: " + Math.log(7.389)); // ln
        System.out.println("Base 10 log of 1000: " + Math.log10(1000));

        // Notes:
        // - Math class methods are static; no need to create an object
        // - Provides common mathematical functions (power, sqrt, trig, random)
        // - All trigonometric methods use radians

    }
}
