package utils;

public class Rack {
    private int number;                // Rack number
    private String locationIdentifier; // Rack location identifier

    // Constructor
    public Rack(int number, String locationIdentifier) {
        this.number = number;
        this.locationIdentifier = locationIdentifier;
    }

    // Getters and Setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getLocationIdentifier() {
        return locationIdentifier;
    }

    public void setLocationIdentifier(String locationIdentifier) {
        this.locationIdentifier = locationIdentifier;
    }

    // Method to display rack details
    public void displayRackDetails() {
        System.out.println("Rack Number: " + number + ", Location: " + locationIdentifier);
    }
}

