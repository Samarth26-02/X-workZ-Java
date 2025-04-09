package Assesments13;

public class WaterPurifier {
    String brand;
    boolean usesRO;
    int storageLiters;

    public WaterPurifier(String brand, boolean usesRO, int storageLiters) {
        this.brand = brand;
        this.usesRO = usesRO;
        this.storageLiters = storageLiters;
    }

    public String toString() {
        return "WaterPurifier: " + brand + ", RO? " + usesRO + ", Storage: " + storageLiters + "L";
    }
}
