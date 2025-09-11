package _05_Inheritance;

// Parent class
class Man {
    String name;  // Field (property) of Man

    // Method of Man
    public void eat() {
        System.out.println(name + " is eating...");
    }
}

// Child class (Boy) inherits from Man
class Boy extends Man {

    // New method specific to Boy
    public void walk() {
        System.out.println(name + " is walking...");
    }
}

public class _01_Basic_Inheritance {
    public static void main(String[] args) {

        // Create object of Boy
        Boy boy = new Boy();

        boy.name = "Adrien"; // inherited field from Man
        boy.eat();  // inherited method from Man
        boy.walk(); // child class method

    }
}
