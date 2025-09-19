package _03_Encapsulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// final class: cannot be extended (prevents modification via inheritance)
final class Course {

    // final fields: value cannot be changed after initialization
    private final String courseName;
    private final int courseNo;
    private final List<String> topics; // List of topics

    // Constructor sets values once during object creation
    public Course(String courseName, int courseNo, List<String> topics) {
        this.courseName = courseName;
        this.courseNo = courseNo;

        // Defensive copy to maintain immutability
        this.topics = new ArrayList<>(topics);
    }

    // Only getters provided (no setters)
    // Ensures the state of the object cannot be modified after creation
    public String getCourseName() {
        return courseName;
    }

    public int getCourseNo() {
        return courseNo;
    }

    public List<String> getTopics() {
        // Return unmodifiable list to prevent external modification
        return Collections.unmodifiableList(topics);
    }
}

public class _05_Immutability {
    public static void main(String[] args) {

        List<String> topics = new ArrayList<>();
        topics.add("Encapsulation");
        topics.add("Abstraction");
        topics.add("Inheritance");
        topics.add("Polymorphism");

        Course course = new Course("Object Oriented Concepts & Programming", 352, topics);

        // Access fields using getters
        System.out.println("Course: " + course.getCourseName() + " - " + course.getCourseNo());
        System.out.println("Topics: " + course.getTopics());

        // Cannot modify fields:
        // course.setCourseNo(354); -> Not allowed (no setter)
        // course.courseNo = 354; -> Not allowed (private + final)

        // Attempt to modify original list (does NOT affect course)
        topics.add("Interfaces");
        System.out.println("Topics after external change attempt: " + course.getTopics());

        // Attempt to modify through getter (throws exception)
        // course.getTopics().add("Spring Boot"); -> UnsupportedOperationException

    }
}
