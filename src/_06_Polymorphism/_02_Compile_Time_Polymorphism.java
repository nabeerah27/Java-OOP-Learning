package _06_Polymorphism;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {  // Overloaded method
        return a + b;
    }

    int add(int a, int b, int c) {  // Overloaded method
        return a + b + c;
    }
}

public class _02_Compile_Time_Polymorphism {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Calling add(int, int): " + calculator.add(567, 103));
        System.out.println("Calling add(double, double): " + calculator.add(82.5, 19.5));
        System.out.println("Calling add(int, int, int): " + calculator.add(41, 90, 77));

    }
}

// Compile-time polymorphism (also called method overloading) occurs when multiple methods
// have the same name but differ in parameters (number, type, or order).
// The method to call is decided at compile time by the compiler, based on the arguments passed.
// It improves code readability and reusability by allowing methods with the same name to handle different input types.
