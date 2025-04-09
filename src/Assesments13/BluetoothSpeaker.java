package Assesments13;

public class BluetoothSpeaker {
    String brand;
    int batteryHours;
    boolean isWaterproof;

    public BluetoothSpeaker(String brand, int batteryHours, boolean isWaterproof) {
        this.brand = brand;
        this.batteryHours = batteryHours;
        this.isWaterproof = isWaterproof;
    }

    public String toString() {
        return "BluetoothSpeaker: " + brand + ", Battery: " + batteryHours + "h, Waterproof? " + isWaterproof;
    }
}
