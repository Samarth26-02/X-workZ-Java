package Assesments13;

public class AirConditioner {
    String brand;
    double tonnage;
    boolean inverter;

    public AirConditioner(String brand, double tonnage, boolean inverter) {
        this.brand = brand;
        this.tonnage = tonnage;
        this.inverter = inverter;
    }

    public String toString() {
        return "AC: " + brand + ", " + tonnage + " Ton, Inverter? " + inverter;
    }
}

