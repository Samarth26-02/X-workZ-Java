package Assesments13;

public class Blender {
    String brand;
    int speedLevels;
    boolean isElectric;

    public Blender(String brand, int speedLevels, boolean isElectric) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.isElectric = isElectric;
    }

    public String toString() {
        return "Blender: " + brand + ", Speeds: " + speedLevels + ", Electric? " + isElectric;
    }
}
