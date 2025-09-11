package _03_Encapsulation;

// Car class demonstrating final variables
class Car {
    private String model;
    private final int VIN; // final instance variable (Vehicle Identification Number)

    public Car(String model, int VIN) {
        this.model = model;
        this.VIN = VIN;
    }

    // Getter and setter
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVIN() {
        return VIN;
    }

    public void display() {
        System.out.println("Car Model: " + getModel() + ", VIN: " + getVIN());
    }
}

public class _04_Final_Variable {
    public static void main(String[] args) {

        Car car1 = new Car("Tesla Model 3", 1001);
        Car car2 = new Car("BMW i8", 1002);

        car1.display();
        car2.display();

        // Modifying model is allowed
        car1.setModel("Tesla Model Y");
        System.out.println("Updated Model:");
        car1.display();

        // Cannot modify VIN as it is final
        // car1.VIN = 2001; -> ERROR

        // Final object reference
        final Car car3 = new Car("Audi e-tron", 1003);

        System.out.println("\nFinal Car:");
        car3.display();

        // Allowed: Modify fields of final object
        car3.setModel("Audi e-tron GT");
        System.out.println("After modifying field:");
        car3.display();

        // Not allowed: Reassign final reference
        // car3 = car1; -> ERROR
        // car3 = new Car("Mercedes EQC", 1004); -> ERROR

    }
}
