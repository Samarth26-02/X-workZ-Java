package Assesments13;

public class Microwave2 {
    String brand;
    int capacityLiters;
    boolean hasGrillFunction;

    public Microwave2(String brand, int capacityLiters, boolean hasGrillFunction) {
        this.brand = brand;
        this.capacityLiters = capacityLiters;
        this.hasGrillFunction = hasGrillFunction;
    }

    public String toString() {
        return "Microwave: " + brand + ", Capacity: " + capacityLiters + "L, Grill? " + hasGrillFunction;
    }
}
