package _05_Inheritance;

// Final class: cannot be extended
final class StudentRecord {

    private final int rollNumber;  // once assigned, cannot be changed
    private String name;
    private double marks;

    // Constructor
    public StudentRecord(int rollNumber, String name, double marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        setMarks(marks);  // use setter for validation
    }

    // Getter methods
    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    // Setter methods (with conditions)
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty())
        {
            this.name = name;
        }
        else
        {
            System.out.println("Invalid name. Update failed.");
        }
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100)
        {
            this.marks = marks;
        }
        else
        {
            System.out.println("Invalid marks. Must be between 0 and 100.");
        }
    }

    @Override
    public String toString() {
        return "Roll number: " + rollNumber + "\nName: " + name + "\nMarks: " + marks;
    }
}

/*  This will cause a compilation error
class GraduateStudent extends StudentRecord {
    ....
} */

public class _09_Final_Class {
    public static void main(String[] args) {

        // Create Student Record
        StudentRecord student = new StudentRecord(101, "John", 85);

        System.out.println("---- Before update ----\n" + student);

        // Update name and marks
        student.setName("Charles");
        student.setMarks(95);

        System.out.println("\n---- After update ----\n" + student);

        // Trying invalid updates
        student.setMarks(-10);   // will show error message
        student.setName("");     // will show error message

        // Roll number cannot be changed because it is final
        // student.rollNumber = 200; -> ERROR
    }
}
