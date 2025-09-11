package _05_Inheritance;

// Parent class
class Person {

    Person(String name) {
        System.out.println("Person: " + name);
    }
}

// Child class
class Student extends Person {

    // Default constructor of Student
    Student() {
        this("Unknown");   // Calls the parameterized constructor of the same class
        System.out.println("Student default constructor");
    }

    // Parameterized constructor of Student
    Student(String name) {
        super(name);   // Calls constructor of the Parent class (Person)
        System.out.println("Student parameterized constructor");
    }
}

public class _04_This_And_Super_Keyword {
    public static void main(String[] args) {

        // When we create Student with default constructor
        System.out.println("--- Student object with default constructor ---");
        Student s1 = new Student();

        // When we create Student with parameterized constructor
        System.out.println("\n--- Student object with parameterized constructor ---");
        Student s2 = new Student("Luna");

    }
}
