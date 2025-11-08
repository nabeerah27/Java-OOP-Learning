package _08_Built_In_Classes;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Locale;
import java.util.Scanner;

public class _02_Scanner_Class {
    public static void main(String[] args) {

        // Example input string to simulate user input
        String input = "42 3.14 true Hello Java 12345678901234567890 99.999 1010";

        // Creating Scanner object from a string (instead of System.in for demo)
        Scanner sc = new Scanner(input);

        // Reading different types of data
        int num = sc.nextInt();             // int
        double pi = sc.nextDouble();        // double
        boolean flag = sc.nextBoolean();    // boolean
        String word1 = sc.next();           // single word
        String word2 = sc.next();           // another word
        BigInteger bigInt = sc.nextBigInteger(); // BigInteger (very large integer)
        BigDecimal bigDec = sc.nextBigDecimal(); // BigDecimal (precise decimal)

        System.out.println("Integer: " + num);
        System.out.println("Double: " + pi);
        System.out.println("Boolean: " + flag);
        System.out.println("Two Words: " + word1 + " " + word2);
        System.out.println("BigInteger: " + bigInt);
        System.out.println("BigDecimal: " + bigDec);

        // Checking before Reading
        if (sc.hasNextInt())
        {
            int anotherNum = sc.nextInt();
            System.out.println("Checked int with hasNextInt(): " + anotherNum);
        }

        // Using custom delimiter (split by digit '1' instead of space)
        String csvInput = "apple,banana,orange";
        Scanner sc2 = new Scanner(csvInput);
        sc2.useDelimiter(","); // set comma as delimiter

        while (sc2.hasNext())
        {
            System.out.println("Fruit: " + sc2.next());
        }

        // Using Radix (Binary numbers)
        String binaryInput = "1010"; // binary for 10
        Scanner sc3 = new Scanner(binaryInput);
        sc3.useRadix(2); // interpret input as binary
        int binaryNum = sc3.nextInt();
        System.out.println("Binary '1010' as decimal: " + binaryNum);

        // Using Locale (for numbers with commas)
        String germanInput = "3,14"; // German uses ',' instead of '.'
        Scanner sc4 = new Scanner(germanInput);
        sc4.useLocale(Locale.GERMANY);
        double germanDouble = sc4.nextDouble();
        System.out.println("German formatted number: " + germanDouble);

        // Utility methods
        System.out.println("Current delimiter in sc2: " + sc2.delimiter());
        System.out.println("Current radix in sc3: " + sc3.radix());

        // Closing scanners
        sc.close();
        sc2.close();
        sc3.close();
        sc4.close();

        // Scanner can read from System.in, files, or strings
        // Methods: nextInt(), nextDouble(), next(), nextLine(), nextBoolean()
        // Always close Scanner to free resources
        // next() reads single word; nextLine() reads entire line including spaces

    }
}
