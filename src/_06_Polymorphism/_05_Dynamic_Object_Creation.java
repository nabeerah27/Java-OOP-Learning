package _06_Polymorphism;

import java.util.Scanner;

// Parent class
class Shape {
    void draw() {
        System.out.println("Drawing a shape...");
    }
}

// Child classes
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }
}

public class _05_Dynamic_Object_Creation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter shape name (Circle/Square): ");
        String input = sc.nextLine();

        Shape shape; // reference variable

        // Object creation based on user input
        if (input.equalsIgnoreCase("Circle"))
        {
            shape = new Circle();
        }
        else if (input.equalsIgnoreCase("Square"))
        {
            shape = new Square();
        }
        else
        {
            shape = new Shape(); // default
        }

        shape.draw(); // Calls respective method

    }
}
