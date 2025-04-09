package Assesments13;

public class Printers {
    String brand;
    boolean isColor;
    boolean isWireless;

    public Printers(String brand, boolean isColor, boolean isWireless) {
        this.brand = brand;
        this.isColor = isColor;
        this.isWireless = isWireless;
    }

    public String toString() {
        return "Printer: " + brand + ", Color? " + isColor + ", Wireless? " + isWireless;
    }
}
