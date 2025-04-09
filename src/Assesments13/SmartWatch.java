package Assesments13;

public class SmartWatch {
    String brand;
    boolean hasGPS;
    int batteryLifeDays;

    public SmartWatch(String brand, boolean hasGPS, int batteryLifeDays) {
        this.brand = brand;
        this.hasGPS = hasGPS;
        this.batteryLifeDays = batteryLifeDays;
    }

    public String toString() {
        return "SmartWatch: " + brand + ", GPS? " + hasGPS + ", Battery: " + batteryLifeDays + " days";
    }
}
