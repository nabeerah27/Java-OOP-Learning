package _08_Built_In_Classes;

// The parent / root of all classes in Java (java.lang.Object).
import java.util.Objects;

class Student implements Cloneable {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Returns a string representation of the object.
    @Override
    public String toString() {
        return "Student { name = " + name + ", age = " + age + " }";
    }

    // Compares objects for logical equality.
    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;

        if (object == null || getClass() != object.getClass())
            return false;

        Student std = (Student) object;
            return age == std.age && Objects.equals(name, std.name);
    }

    // Must be consistent with equals()
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    // Creates a shallow copy
    @Override
    public Student clone() throws CloneNotSupportedException {
        return (Student) super.clone();
    }

    /* Called by Garbage Collector before object is destroyed (deprecated in Java 9+)
    @Override
    protected void finalize() {
        System.out.println("Cleaning up resources.....");
    } */
}

public class _01_Object_Class {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student s1 = new Student("Lucy", 20);
        Student s2 = new Student("Rose", 17);
        Student s3 = new Student("Jack", 25);
        Student s4 = new Student("Lucy", 20);

        System.out.println("======= toString() method =======");
        System.out.println("s1: " + s1.toString()); // our overridden version
        System.out.println("s2: " + s2);            // auto calls toString()
        System.out.println();

        System.out.println("======= equals() method =======");
        System.out.println("Is s1 and s2 equal? : " + s2.equals(s1));
        System.out.println("Is s1 and s4 equal? : " + s1.equals(s4));
        System.out.println();

        System.out.println("======= hashCode() method =======");
        System.out.println("s1 hashCode: " + s1.hashCode());
        System.out.println("s2 hashCode: " + s2.hashCode());
        System.out.println("s4 hashCode: " + s4.hashCode()); // s1 and s4 should match
        System.out.println("Here, s1 and s2 have same hashCode because they are equal!");
        System.out.println();

        System.out.println("======= clone() method =======");
        Student s5 = s2.clone(); // shallow copy
        System.out.println("Cloned s5: " + s5);

        s5.name = "John";  // String replaced (safe since String is immutable)
        System.out.println("s2 name: " + s2.name);
        System.out.println("s5 name: " + s5.name);

        s2.age = 19; // int copied by value, so s5 unaffected
        System.out.println("s2 age: " + s2.age);
        System.out.println("s5 age: " + s5.age);
        System.out.println();

        System.out.println("======= getClass() method =======");
        System.out.println("s3 runtime class: " + s3.getClass());
        System.out.println("s5 runtime class: " + s5.getClass());

    }
}

// Object is the root class of Java; all classes inherit it directly or indirectly.
// It provides common methods like toString(), equals(), hashCode(), clone(), and getClass().
