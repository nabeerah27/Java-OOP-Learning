package _02_Static_Concepts;

class Numbers {
    // Static variables – shared among all objects
    static int num1 = 7;
    static int num2;

    // Static block executes once when the class is loaded
    static {
        System.out.println("I am in static block!");
        num2 = num1 * 3;  // initialize num2 based on num1
    }
}

public class _03_Static_Block {
    public static void main(String[] args) {

        // First object creation – class is loaded, static block runs only once
        Numbers numbers1 = new Numbers();

        // Accessing static variables via object (works, but not recommended)
        System.out.println(numbers1.num1 + ", " + numbers1.num2);

        // Accessing/modifying static variable via class name (recommended)
        Numbers.num2 += 9;
        System.out.println(Numbers.num1 + ", " + Numbers.num2);

        // Creating second object – static block does NOT run again
        Numbers numbers2 = new Numbers();
        System.out.println(Numbers.num1 + ", " + Numbers.num2);

    }
}
