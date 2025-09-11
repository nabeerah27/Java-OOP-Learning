package _05_Inheritance;

interface Camera {
    void takePhoto(); // Abstract method for taking photo
}

interface GPS {
    void navigate(); // Abstract method for navigation
}

// SmartDevice interface EXTENDS both Camera and GPS
// This is multiple inheritance at the INTERFACE level.
// This means any SmartDevice must have both Camera and GPS capabilities + its own feature (browseInternet)

interface SmartDevice extends Camera, GPS {
    void browseInternet(); // Abstract method for browsing the internet
}

// Smartphone class implements SmartDevice, since SmartDevice extends Camera + GPS,
class Smartphone implements SmartDevice {

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    @Override
    public void navigate() {
        System.out.println("Navigating with GPS...");
    }

    @Override
    public void browseInternet() {
        System.out.println("Browsing the internet...");
    }
}

public class _07_Multiple_Inheritance_Using_Interfaces {
    public static void main(String[] args) {

        // Reference type = SmartDevice, Object type = Smartphone
        // This shows POLYMORPHISM: we can treat Smartphone as a SmartDevice
        SmartDevice phone = new Smartphone();

        // Call all the methods defined in SmartDevice (and inherited interfaces)
        phone.takePhoto();      // From Camera
        phone.navigate();       // From GPS
        phone.browseInternet(); // From SmartDevice

    }
}
