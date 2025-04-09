package Assesments13;

public class Grinder {
    String brand;
    int rpm;
    boolean hasOverloadProtection;

    public Grinder(String brand, int rpm, boolean hasOverloadProtection) {
        this.brand = brand;
        this.rpm = rpm;
        this.hasOverloadProtection = hasOverloadProtection;
    }

    public String toString() {
        return "Grinder: " + brand + ", RPM: " + rpm + ", Overload Protection? " + hasOverloadProtection;
    }
}
