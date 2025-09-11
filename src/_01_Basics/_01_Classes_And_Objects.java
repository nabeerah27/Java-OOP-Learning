package _01_Basics;

// Class: A blueprint for creating objects.
// Defines fields (attributes) and methods (behaviors).

class Student {

    // Fields (attributes) -> can be public or private
    String name;
    int age;

    // Method (behavior)
    void study() {
        // Accessing object state (fields) directly
        System.out.println(name + " is studying...");
    }
}

public class _01_Classes_And_Objects {
    public static void main(String[] args) {

        // Object: A real-world entity created from a class.
        // Each object has its own copy of fields but shares the class methods.

        // Object creation
        Student s1 = new Student();
        s1.name = "Julie";
        s1.age = 22;

        Student s2 = new Student();
        s2.name = "Jane";
        s2.age = 30;

        // Using objects
        s1.study();
        s2.study();

    }
}
