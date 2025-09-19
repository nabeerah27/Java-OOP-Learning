package _05_Inheritance;

// Parent class
class Person {

    Person(String name) {
        System.out.println("Person: " + name);
    }
}

// Child class
class Teacher extends Person {

    // Default constructor of Teacher
    Teacher() {
        this("Unknown");   // Calls the parameterized constructor of the same class
        System.out.println("Student default constructor");
    }

    // Parameterized constructor of Teacher
    Teacher(String name) {
        super(name);   // Calls constructor of the Parent class (Person)
        System.out.println("Student parameterized constructor");
    }
}

public class _04_This_And_Super_Keyword {
    public static void main(String[] args) {

        // When we create Teacher with default constructor
        System.out.println("--- Teacher object with default constructor ---");
        Teacher s1 = new Teacher();

        // When we create Teacher with parameterized constructor
        System.out.println("\n--- Teacher object with parameterized constructor ---");
        Teacher s2 = new Teacher("Luna");

    }
}
