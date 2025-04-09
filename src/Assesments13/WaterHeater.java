package Assesments13;

public class WaterHeater {
    String brand;
    int capacityLiters;
    boolean isInstant;

    public WaterHeater(String brand, int capacityLiters, boolean isInstant) {
        this.brand = brand;
        this.capacityLiters = capacityLiters;
        this.isInstant = isInstant;
    }

    public String toString() {
        return "WaterHeater: " + brand + ", Capacity: " + capacityLiters + "L, Instant? " + isInstant;
    }
}
