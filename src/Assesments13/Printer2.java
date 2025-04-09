package Assesments13;

public class Printer2 {
    String brand;
    boolean isColorPrinter;
    int pagesPerMinute;

    public Printer2(String brand, boolean isColorPrinter, int pagesPerMinute) {
        this.brand = brand;
        this.isColorPrinter = isColorPrinter;
        this.pagesPerMinute = pagesPerMinute;
    }

    public String toString() {
        return "Printer: " + brand + ", Color? " + isColorPrinter + ", Speed: " + pagesPerMinute + " ppm";
    }
}
