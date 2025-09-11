package _03_Encapsulation;

// Student class demonstrating getters and setters
class Student {

    // Private fields
    private String name;
    private double gpa;

    // Constructor
    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    // Getters
    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    // Setters with validation
    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0)
        {
            this.gpa = gpa;
        }
        else
        {
            System.out.println("Invalid GPA!");
        }
    }
}

public class _03_Getters_And_Setters {
    public static void main(String[] args) {

        // Create a Student object
        Student student = new Student("Peter", 3.5);

        // Access private fields using getters
        System.out.println("Name: " + student.getName());
        System.out.println("GPA: " + student.getGpa());

        // Update fields using setters
        student.setGpa(3.8);

        System.out.println("\nAfter updates:");
        System.out.println("GPA: " + student.getGpa());

        // Invalid update
        student.setGpa(4.5);

    }
}
