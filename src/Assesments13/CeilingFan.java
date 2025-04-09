package Assesments13;

public class CeilingFan {
    String brand;
    int speedLevels;
    boolean hasRemote;

    public CeilingFan(String brand, int speedLevels, boolean hasRemote) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.hasRemote = hasRemote;
    }

    public String toString() {
        return "CeilingFan: " + brand + ", Speeds: " + speedLevels + ", Remote? " + hasRemote;
    }
}
