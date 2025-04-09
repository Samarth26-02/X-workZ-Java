package Assesments13;

public class WashingMachine {
    String brand;
    int capacityKg;
    boolean isFrontLoad;

    public WashingMachine(String brand, int capacityKg, boolean isFrontLoad) {
        this.brand = brand;
        this.capacityKg = capacityKg;
        this.isFrontLoad = isFrontLoad;
    }

    public String toString() {
        return "WashingMachine: " + brand + ", " + capacityKg + "kg, Front Load? " + isFrontLoad;
    }
}
