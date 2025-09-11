package _01_Basics;

class Car {
    // Fields
    String brand;
    int year;

    // Parameterized Constructor
    Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Method to display car details
    void showDetails() {
        System.out.println("Car Brand: " + brand +
                           "\nManufacturing Year: " + year +
                           "\n--------------------------------");

    }
}

class Garage {

    // Method returns a new Car object
    Car createCar(String brand, int year) {
        Car car = new Car(brand, year); // Create a Car object
        return car;                     // Return the object
    }
}

// Demonstrate returning an object from a method in Java
public class _07_Return_Type_Object {
    public static void main(String[] args) {

        // Create a Garage object
        Garage garage = new Garage();

        // Call the method to get Car objects
        Car car1 = garage.createCar("Toyota", 2017);
        Car car2 = garage.createCar("Honda", 2022);

        // Use the returned Car objects
        car1.showDetails();
        car2.showDetails();

    }
}
