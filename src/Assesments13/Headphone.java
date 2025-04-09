package Assesments13;

public class Headphone {
    String brand;
    boolean isWireless;
    String color;

    public Headphone(String brand, boolean isWireless, String color) {
        this.brand = brand;
        this.isWireless = isWireless;
        this.color = color;
    }

    public String toString() {
        return "Headphone: " + brand + ", Wireless? " + isWireless + ", Color: " + color;
    }
}
