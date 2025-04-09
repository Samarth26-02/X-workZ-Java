package Assesments13;

public class Washer {
    String brand;
    int capacityKg;
    boolean isFrontLoad;

    public Washer(String brand, int capacityKg, boolean isFrontLoad) {
        this.brand = brand;
        this.capacityKg = capacityKg;
        this.isFrontLoad = isFrontLoad;
    }

    public String toString() {
        return "Washer: " + brand + ", Capacity: " + capacityKg + "kg, Front Load? " + isFrontLoad;
    }
}
