package _01_Basics;

// Point class representing a point in 2D space
class Point {

    // Fields (primitive types)
    int x;
    int y;

    // Default constructor sets x and y to 0
    public Point() {
        this(0, 0); // calls parameterized constructor
    }

    // Parameterized constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy constructor
    // Creates a new Point object with the same values as 'other'
    public Point(Point other) {
        this(other.x, other.y);
    }

    // toString method for easy printing
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

// Main class to test copy constructor and reference assignment
public class _04_Copy_Constructor {
    public static void main(String[] args) {

        // Original points
        Point p1 = new Point();       // (0,0)
        Point p2 = new Point(-4, 7);  // (-4,7)

        // Reference assignment
        Point p3 = p1; // p3 points to the same object as p1

        // Copy constructor
        Point p4 = new Point(p2); // p4 is a new object with same values as p2

        // Print initial values
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("p3: " + p3); // same as p1
        System.out.println("p4: " + p4); // copy of p2

        // Modify p1 and p3
        p1.x = 6;
        p3.y = 1;  // affects p1 too, because p3 and p1 refer to the same object
        System.out.println("p3: " + p3);
        System.out.println("p1: " + p1);

        // Modify p2 and p4
        p2.x = 5;
        p4.y = 3;  // does NOT affect p2, because p4 is a copy
        System.out.println("p2: " + p2);
        System.out.println("p4: " + p4);

    }
}
