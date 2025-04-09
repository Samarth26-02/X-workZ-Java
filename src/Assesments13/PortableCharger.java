package Assesments13;

public class PortableCharger {
    String brand;
    int capacitymAh;
    int outputPorts;

    public PortableCharger(String brand, int capacitymAh, int outputPorts) {
        this.brand = brand;
        this.capacitymAh = capacitymAh;
        this.outputPorts = outputPorts;
    }

    public String toString() {
        return "PortableCharger: " + brand + ", Capacity: " + capacitymAh + "mAh, Ports: " + outputPorts;
    }
}
