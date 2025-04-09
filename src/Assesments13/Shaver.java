package Assesments13;

public class Shaver {
    String brand;
    boolean isRechargeable;
    int bladeCount;

    public Shaver(String brand, boolean isRechargeable, int bladeCount) {
        this.brand = brand;
        this.isRechargeable = isRechargeable;
        this.bladeCount = bladeCount;
    }

    public String toString() {
        return "Shaver: " + brand + ", Rechargeable? " + isRechargeable + ", Blades: " + bladeCount;
    }
}
