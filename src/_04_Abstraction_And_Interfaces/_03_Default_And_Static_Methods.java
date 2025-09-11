package _04_Abstraction_And_Interfaces;

// Interface with abstract, default, and static methods
interface Printer {
    void print(String document);  // abstract method

    // Default method: belongs to object
    default void connect() {
        System.out.println("Connecting to printer via USB.");
    }

    // Static method: belongs to interface, not object
    static void showPrinterInfo() {
        System.out.println("All printers must support basic printing functionality.");
    }
}

// Implementing interface
class InkjetPrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Inkjet printing: " + document);
    }

    // Overriding default method
    @Override
    public void connect() {
        System.out.println("Connecting to Inkjet Printer via WiFi.");
    }
}

class LaserPrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Laser printing: " + document);
    }
}

public class _03_Default_And_Static_Methods {
    public static void main(String[] args) {

        Printer inkjet = new InkjetPrinter();

        inkjet.connect();  // calls overridden method
        inkjet.print("Report.pdf");

        System.out.println();

        Printer laser = new LaserPrinter();
        laser.connect();  // calls default method
        laser.print("Interface.docx");

        System.out.println("\n---- Static method from Interface ----");
        Printer.showPrinterInfo(); // call via Interface name only!

        // Wrong way
        // inkjet.showPrinterInfo(); // ERROR → static methods in interfaces cannot be called using object reference

    }
}
