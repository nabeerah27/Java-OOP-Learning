package _08_Built_In_Classes;

public class _05_StringBuilder_Class {
    public static void main(String[] args) {

        // Creating StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println("Original StringBuilder: " + sb);

        // Append: adds text at the end
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert: inserts text at a specific index
        sb.insert(6, "Java ");
        System.out.println("After insert at index 6: " + sb);

        // Replace: replaces a substring
        sb.replace(6, 10, "DSA");
        System.out.println("After replace (6-10) with 'DSA': " + sb);

        // Delete: removes characters from start to end-1 index
        sb.delete(6, 9);
        System.out.println("After delete (6-9): " + sb);

        // Reverse: reverses the sequence
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Length and Capacity
        System.out.println("Length of StringBuilder: " + sb.length());
        System.out.println("Capacity of StringBuilder: " + sb.capacity());

        // Chaining Methods (fluent style)
        StringBuilder sb2 = new StringBuilder("Java");
        sb2.append(" is ").append("fun").insert(8, "!").reverse();
        System.out.println("Chaining example: " + sb2);

        // Notes:
        // - StringBuilder is mutable (changes happen in the same object)
        // - Faster than String when doing multiple modifications
        // - Not thread-safe (use StringBuffer for thread-safety)

    }
}
