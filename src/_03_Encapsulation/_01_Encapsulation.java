package _03_Encapsulation;

// TV class demonstrating encapsulation
class TV {

    // Private fields
    private int channel;
    private int volume;
    private boolean isOn;

    // Constructor
    public TV(int channel, int volume, boolean isOn) {
        this.channel = channel;
        this.volume = volume;
        this.isOn = isOn;
    }

    // Getters
    public int getChannel() {
        return channel;
    }
    public int getVolume() {
        return volume;
    }
    public boolean isOn() {
        return isOn;
    }

    // Setters with validation
    public void setChannel(int channel) {
        if (channel >= 1 && channel <= 50)
        {
            this.channel = channel;
        }
        else
        {
            System.out.println("Invalid channel number.");
        }
    }

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100)
        {
            this.volume = volume;
        }
        else
        {
            System.out.println("Volume must be between 0 and 100.");
        }
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    // Method to display TV status
    public void displayStatus() {
        System.out.println("Channel: " + channel +
                ", Volume: " + volume +
                ", Status: " + (isOn ? "ON" : "OFF"));
    }
}

public class _01_Encapsulation {
    public static void main(String[] args) {

        // Create a TV object
        TV tv = new TV(5, 25, false);

        tv.displayStatus();

        // Update TV properties
        tv.setChannel(1500); // invalid
        tv.setVolume(-5);    // invalid
        tv.setOn(true);     // valid
        tv.setChannel(10);  // valid
        tv.setVolume(30);   // valid

        System.out.println("..........After updates..........");
        tv.displayStatus();

    }
}
