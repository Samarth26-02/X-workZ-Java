package Assesments13;

public class ElectricKettle {
    String brand;
    double capacityLiters;
    boolean autoShutoff;

    public ElectricKettle(String brand, double capacityLiters, boolean autoShutoff) {
        this.brand = brand;
        this.capacityLiters = capacityLiters;
        this.autoShutoff = autoShutoff;
    }

    public String toString() {
        return "ElectricKettle: " + brand + ", Capacity: " + capacityLiters + "L, Auto Shutoff? " + autoShutoff;
    }
}
