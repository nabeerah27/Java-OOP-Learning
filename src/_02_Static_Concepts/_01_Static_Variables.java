package _02_Static_Concepts;

class Employee {

    private String name;
    private double salary;
    private static String company = "Google";  // shared by all objects

    // Constructor
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Instance method to display employee details
    void displayDetails() {
        // company is static → same for all Employee objects
        System.out.println("Name: " + name + ", Salary: " + salary + ", Company: " + company);
    }
}

class Human {

    private String name;
    private int age;
    private static int population; // shared by all Human objects

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        Human.population++; // static variable incremented for each new object
    }

    void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Population: " + population);
    }
}

public class _01_Static_Variables {
    public static void main(String[] args) {

        // Creating Employee objects
        Employee employee1 = new Employee("Peter", 10000);
        Employee employee2 = new Employee("Jane", 25000);

        employee1.displayDetails();
        employee2.displayDetails();

        // Creating Human objects
        Human human1 = new Human("Fariha", 22);
        Human human2 = new Human("Laiba", 30);
        human1.printInfo();
        human2.printInfo();

        Human human3 = new Human("Hafsa", 17);
        human3.printInfo();

    }
}
