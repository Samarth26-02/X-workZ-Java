package Assesments13;

public class IronBox {
    String brand;
    boolean steamIron;
    double weightKg;

    public IronBox(String brand, boolean steamIron, double weightKg) {
        this.brand = brand;
        this.steamIron = steamIron;
        this.weightKg = weightKg;
    }

    public String toString() {
        return "IronBox: " + brand + ", Steam? " + steamIron + ", Weight: " + weightKg + "kg";
    }
}
