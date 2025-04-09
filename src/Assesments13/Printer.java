package Assesments13;

public class Printer {
    String brand;
    boolean isColor;
    int ppm; // pages per minute

    public Printer(String brand, boolean isColor, int ppm) {
        this.brand = brand;
        this.isColor = isColor;
        this.ppm = ppm;
    }

    public String toString() {
        return "Printer: " + brand + ", Color? " + isColor + ", " + ppm + " ppm";
    }
}

