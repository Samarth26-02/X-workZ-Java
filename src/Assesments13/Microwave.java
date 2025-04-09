package Assesments13;

public class Microwave {
    String brand;
    int powerWatts;
    boolean hasGrillFunction;

    public Microwave(String brand, int powerWatts, boolean hasGrillFunction) {
        this.brand = brand;
        this.powerWatts = powerWatts;
        this.hasGrillFunction = hasGrillFunction;
    }

    public String toString() {
        return "Microwave: " + brand + ", " + powerWatts + "W, Grill? " + hasGrillFunction;
    }
}

