package Assesments13;

public class AirConditioner2 {
    String brand;
    int tonnage;
    boolean isInverter;

    public AirConditioner2(String brand, int tonnage, boolean isInverter) {
        this.brand = brand;
        this.tonnage = tonnage;
        this.isInverter = isInverter;
    }

    public String toString() {
        return "AirConditioner: " + brand + ", Tonnage: " + tonnage + ", Inverter? " + isInverter;
    }
}
