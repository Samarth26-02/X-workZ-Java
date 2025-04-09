package Assesments13;

public class Mouse2 {
    String brand;
    boolean isWireless;
    int dpi;

    public Mouse2(String brand, boolean isWireless, int dpi) {
        this.brand = brand;
        this.isWireless = isWireless;
        this.dpi = dpi;
    }

    public String toString() {
        return "Mouse: " + brand + ", Wireless? " + isWireless + ", DPI: " + dpi;
    }
}
