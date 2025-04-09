package Assesments13;

public class Refrigerator {
    String brand;
    int capacityLiters;
    boolean hasFreezer;

    public Refrigerator(String brand, int capacityLiters, boolean hasFreezer) {
        this.brand = brand;
        this.capacityLiters = capacityLiters;
        this.hasFreezer = hasFreezer;
    }

    public String toString() {
        return "Refrigerator: " + brand + ", " + capacityLiters + "L, Freezer? " + hasFreezer;
    }
}
