package Assesments13;

public class VacuumCleaner2 {
    String brand;
    boolean isBagless;
    int powerWatt;

    public VacuumCleaner2(String brand, boolean isBagless, int powerWatt) {
        this.brand = brand;
        this.isBagless = isBagless;
        this.powerWatt = powerWatt;
    }

    public String toString() {
        return "VacuumCleaner: " + brand + ", Bagless? " + isBagless + ", Power: " + powerWatt + "W";
    }
}
