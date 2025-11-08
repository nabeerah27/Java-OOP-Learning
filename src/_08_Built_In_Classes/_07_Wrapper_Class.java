package _08_Built_In_Classes;

public class _07_Wrapper_Class {
    public static void main(String[] args) {

        // Autoboxing: converting primitive to wrapper object
        int num = 25;
        Integer numObj = num; // int → Integer (Autoboxing)
        System.out.println("Autoboxing: Primitive int → Integer object: " + numObj);

        // Unboxing: converting wrapper object back to primitive
        Integer anotherNumObj = 50;
        int anotherNum = anotherNumObj; // Integer → int (Unboxing)
        System.out.println("Unboxing: Integer object → Primitive int: " + anotherNum);

        // Parsing: converting String to primitive or wrapper object
        String strNumber = "100";
        int parsedInt = Integer.parseInt(strNumber); // String → int
        double parsedDouble = Double.parseDouble("99.99"); // String → double
        System.out.println("Parsing String to int: " + parsedInt);
        System.out.println("Parsing String to double: " + parsedDouble);

        // Utility Methods
        int maxVal = Integer.max(10, 20); // finds maximum
        int minVal = Integer.min(10, 20); // finds minimum
        int sumVal = Integer.sum(10, 20); // sums two numbers
        System.out.println("Max of 10 and 20: " + maxVal);
        System.out.println("Min of 10 and 20: " + minVal);
        System.out.println("Sum of 10 and 20: " + sumVal);

        // Converting wrapper to binary, hex, and octal strings
        int number = 42;
        System.out.println("Binary of 42: " + Integer.toBinaryString(number));
        System.out.println("Hexadecimal of 42: " + Integer.toHexString(number));
        System.out.println("Octal of 42: " + Integer.toOctalString(number));

        // Boolean Wrapper example
        Boolean boolObj = Boolean.parseBoolean("true"); // String → Boolean
        System.out.println("Parsed Boolean: " + boolObj);

        // Character Wrapper example
        char ch = 'A';
        Character charObj = ch; // Autoboxing
        System.out.println("Character Object: " + charObj);
        System.out.println("Is 'A' a letter? " + Character.isLetter(ch));
        System.out.println("Is 'A' a digit? " + Character.isDigit(ch));

    }
}
