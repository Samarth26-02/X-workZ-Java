package Assesments13;

public class Toothbrush {
    String brand;
    boolean isElectric;
    String bristleType;

    public Toothbrush(String brand, boolean isElectric, String bristleType) {
        this.brand = brand;
        this.isElectric = isElectric;
        this.bristleType = bristleType;
    }

    public String toString() {
        return "Toothbrush: " + brand + ", Electric? " + isElectric + ", Bristles: " + bristleType;
    }
}
