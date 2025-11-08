package _08_Built_In_Classes;

import java.util.Random;

public class _06_Random_Class {
    public static void main(String[] args) {

        // Creating Random object
        Random rand = new Random(); // default constructor uses current time as seed

        // Generating random integers
        int randomInt = rand.nextInt(); // any integer (positive or negative)
        System.out.println("Random integer: " + randomInt);

        int randomIntBounded = rand.nextInt(100); // 0 to 99
        System.out.println("Random integer between 0 and 99: " + randomIntBounded);

        // Generating random doubles
        double randomDouble = rand.nextDouble(); // 0.0 <= value < 1.0
        System.out.println("Random double between 0.0 and 1.0: " + randomDouble);

        // Generating random booleans
        boolean randomBool = rand.nextBoolean();
        System.out.println("Random boolean: " + randomBool);

        // Generating random long and float
        long randomLong = rand.nextLong();
        float randomFloat = rand.nextFloat(); // 0.0 <= value < 1.0
        System.out.println("Random long: " + randomLong);
        System.out.println("Random float: " + randomFloat);

        // Seeded Random: generates same sequence if seed is same
        Random seededRand = new Random(12345);
        System.out.println("\nSeeded random integer: " + seededRand.nextInt(100));
        System.out.println("Seeded random integer: " + seededRand.nextInt(100));

        // Notes:
        // - Random object can generate int, double, float, long, boolean, bytes
        // - nextInt(bound) generates numbers from 0 (inclusive) to bound (exclusive)
        // - Using a seed produces repeatable random sequences
        // - For secure random numbers, use java.security.SecureRandom

    }
}
