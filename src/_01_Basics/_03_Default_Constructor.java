package _01_Basics;

// Class representing an unknown entity
class Unknown {

    // Instance variables (fields) – not explicitly initialized
    // Java assigns default values automatically

    String name;
    int age;
    char gender;
    boolean isHappy;
    double height;

}

public class _03_Default_Constructor {
    public static void main(String[] args) {

        // Create an object of Unknown class
        // Java automatically calls the default constructor
        Unknown unknown = new Unknown();

        // Assign values to some fields
        unknown.gender = 'F';
        unknown.height = 5.2;

        // Access and print the values of all fields
        System.out.println(unknown.name);
        System.out.println(unknown.age);
        System.out.println(unknown.gender);
        System.out.println(unknown.isHappy);
        System.out.println(unknown.height);

    }
}
