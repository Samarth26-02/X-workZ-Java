package Assesments13;

public class VacuumCleaner {
    String brand;
    int powerWatts;
    boolean bagless;

    public VacuumCleaner(String brand, int powerWatts, boolean bagless) {
        this.brand = brand;
        this.powerWatts = powerWatts;
        this.bagless = bagless;
    }

    public String toString() {
        return "VacuumCleaner: " + brand + ", Power: " + powerWatts + "W, Bagless? " + bagless;
    }
}

