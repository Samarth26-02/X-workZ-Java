package Assesments13;

public class Suitcase {
    String brand;
    double weightKg;
    boolean hasWheels;

    public Suitcase(String brand, double weightKg, boolean hasWheels) {
        this.brand = brand;
        this.weightKg = weightKg;
        this.hasWheels = hasWheels;
    }

    public String toString() {
        return "Suitcase: " + brand + ", Weight: " + weightKg + "kg, Wheels? " + hasWheels;
    }
}
