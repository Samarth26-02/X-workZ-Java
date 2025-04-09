package Assesments13;

public class Speaker {
    String brand;
    int powerWatts;
    boolean bluetooth;

    public Speaker(String brand, int powerWatts, boolean bluetooth) {
        this.brand = brand;
        this.powerWatts = powerWatts;
        this.bluetooth = bluetooth;
    }

    public String toString() {
        return "Speaker: " + brand + ", Power: " + powerWatts + "W, Bluetooth? " + bluetooth;
    }
}
