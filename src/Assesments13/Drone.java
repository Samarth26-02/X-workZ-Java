package Assesments13;

public class Drone {
    String brand;
    int flightTimeMinutes;
    boolean hasCamera;

    public Drone(String brand, int flightTimeMinutes, boolean hasCamera) {
        this.brand = brand;
        this.flightTimeMinutes = flightTimeMinutes;
        this.hasCamera = hasCamera;
    }

    public String toString() {
        return "Drone: " + brand + ", Flight Time: " + flightTimeMinutes + " mins, Camera? " + hasCamera;
    }
}
