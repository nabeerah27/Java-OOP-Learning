package _01_Basics;

class Employee {

    String name;
    int age;

    // Default constructor (no parameters)
    // Called when we create an object without passing values

    Employee() {

    }

    // Parameterized constructor (takes name and age)
    // Called when we create an object and provide initial values

    Employee(String name, int age) {
        this.name = name; // 'this' keyword refers to current object
        this.age = age;
    }
}

public class _02_Constructors {
    public static void main(String[] args) {

        // Using default constructor
        Employee e1 = new Employee(); // default constructor called

        // Assigning values manually
        e1.name = "Kate";
        e1.age = 22;
        System.out.println(e1.name + ", " + e1.age);

        // Using parameterized constructor
        Employee e2 = new Employee("Jake", 20); // constructor assigns values
        System.out.println(e2.name + ", " + e2.age);

    }
}
