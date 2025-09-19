package _06_Polymorphism;

class Car {
    public void show() {
        System.out.println("I am a car.");
    }
}

class ElectricCar extends Car {
    @Override
    public void show() {
        System.out.println("I am an electric car.");
    }
}

public class _01_Overriding {
    public static void main(String[] args) {

        System.out.println("Calling show() using Car reference and Car object:");
        Car car = new Car();
        car.show();

        System.out.println("\nCalling show() using ElectricCar reference and ElectricCar object:");
        ElectricCar electricCar = new ElectricCar();
        electricCar.show();

        System.out.println("\nCalling show() using Car reference and ElectricCar object (Upcasting):");
        Car obj = new ElectricCar();
        obj.show();

    }
}

// Overriding → Same method name + same parameters + child class changes implementation.
// Overriding is used when a derived class needs to provide a specific implementation of a
// function already defined in its base class.
// Uses dynamic binding (method decided at runtime, not compile time) -> runtime polymorphism.
