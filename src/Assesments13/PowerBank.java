package Assesments13;

public class PowerBank {
    String brand;
    int capacitymAh;
    boolean supportsFastCharging;

    public PowerBank(String brand, int capacitymAh, boolean supportsFastCharging) {
        this.brand = brand;
        this.capacitymAh = capacitymAh;
        this.supportsFastCharging = supportsFastCharging;
    }

    public String toString() {
        return "PowerBank: " + brand + ", Capacity: " + capacitymAh + "mAh, Fast Charging? " + supportsFastCharging;
    }
}
