package _03_Encapsulation;

// final class: cannot be extended (prevents modification via inheritance)
final class ImmutableStudent {

    private final String name; // final fields: value cannot be changed after initialization
    private final int age;

    // Constructor sets values once during object creation
    public ImmutableStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Only getters provided (no setters)
    // Ensures the state of the object cannot be modified after creation
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class _06_Immutability {
    public static void main(String[] args) {

        ImmutableStudent student = new ImmutableStudent("Julie", 23);

        // Access fields using getters
        System.out.println(student.getName() + " - " + student.getAge());

        // Cannot modify fields:
        // student.setAge(30); -> Not allowed (no setter)
        // student.age = 30; -> Not allowed (private + final)

    }
}
