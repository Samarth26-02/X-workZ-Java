package Assesments13;

public class Dryer {
    String brand;
    int capacityKg;
    boolean hasSteamFunction;

    public Dryer(String brand, int capacityKg, boolean hasSteamFunction) {
        this.brand = brand;
        this.capacityKg = capacityKg;
        this.hasSteamFunction = hasSteamFunction;
    }

    public String toString() {
        return "Dryer: " + brand + ", Capacity: " + capacityKg + "kg, Steam Function? " + hasSteamFunction;
    }
}
