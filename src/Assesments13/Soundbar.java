package Assesments13;

public class Soundbar {
    String brand;
    int wattage;
    boolean hasSubwoofer;

    public Soundbar(String brand, int wattage, boolean hasSubwoofer) {
        this.brand = brand;
        this.wattage = wattage;
        this.hasSubwoofer = hasSubwoofer;
    }

    public String toString() {
        return "Soundbar: " + brand + ", Wattage: " + wattage + "W, Subwoofer? " + hasSubwoofer;
    }
}
