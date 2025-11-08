package _08_Built_In_Classes;

public class _04_String_Class {
    public static void main(String[] args) {

        // Creating Strings
        String str1 = "Hello"; // String literal (stored in string pool)
        String str2 = new String("World"); // Using new keyword (heap memory)
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // Immutability: original string remains unchanged
        String str3 = str1.concat(" Java"); // concat() returns a new string
        System.out.println("Original String (str1): " + str1);
        System.out.println("After concat (str3): " + str3);

        // Commonly Used Methods
        System.out.println("\n--- String Methods ---");
        System.out.println("Length of str2: " + str2.length()); // length()
        System.out.println("Character at index 2 of str3: " + str3.charAt(2)); // charAt()
        System.out.println("Substring of str3 (6-10): " + str3.substring(6, 10)); // substring()
        System.out.println("Uppercase str3: " + str3.toUpperCase()); // toUpperCase()
        System.out.println("Lowercase str3: " + str3.toLowerCase()); // toLowerCase()
        System.out.println("Does str3 contain 'Java'? " + str3.contains("Java")); // contains()
        System.out.println("Replace 'Java' with 'World': " + str3.replace("Java", "World")); // replace()

        // Comparing Strings
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        System.out.println("\n--- String Comparison ---");
        System.out.println("a == b: " + (a == b)); // true, same string pool object
        System.out.println("a == c: " + (a == c)); // false, different object in heap
        System.out.println("a.equals(c): " + a.equals(c)); // true, content is same
        System.out.println("a.compareTo(c): " + a.compareTo(c)); // 0, content comparison

        // Splitting and Trimming
        String sentence = "  Java is fun  ";
        String[] words = sentence.trim().split(" "); // trim() + split()
        System.out.println("\nWords after trimming and splitting:");
        for (String word : words) {
            System.out.println(word);
        }

        // Converting other types to String
        int num = 100;
        String numStr = String.valueOf(num); // int → String
        System.out.println("\nInteger 100 converted to String: " + numStr);

        boolean flag = true;
        String boolStr = String.valueOf(flag); // boolean → String
        System.out.println("Boolean true converted to String: " + boolStr);

    }
}
