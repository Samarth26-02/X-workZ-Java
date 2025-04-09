package Assesments13;

public class Fan2 {
    String brand;
    int speedLevels;
    boolean isCeilingFan;

    public Fan2(String brand, int speedLevels, boolean isCeilingFan) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.isCeilingFan = isCeilingFan;
    }

    public String toString() {
        return "Fan: " + brand + ", Speed Levels: " + speedLevels + ", Ceiling Fan? " + isCeilingFan;
    }
}
