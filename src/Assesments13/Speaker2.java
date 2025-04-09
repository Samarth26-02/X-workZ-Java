package Assesments13;

public class Speaker2 {
    String brand;
    int outputWatt;
    boolean isBluetooth;

    public Speaker2(String brand, int outputWatt, boolean isBluetooth) {
        this.brand = brand;
        this.outputWatt = outputWatt;
        this.isBluetooth = isBluetooth;
    }

    public String toString() {
        return "Speaker: " + brand + ", Output: " + outputWatt + "W, Bluetooth? " + isBluetooth;
    }
}
