package Assesments13;

public class Tablet {
    String brand;
    double screenSize;
    boolean hasStylus;

    public Tablet(String brand, double screenSize, boolean hasStylus) {
        this.brand = brand;
        this.screenSize = screenSize;
        this.hasStylus = hasStylus;
    }

    public String toString() {
        return "Tablet: " + brand + ", Screen: " + screenSize + " in, Stylus? " + hasStylus;
    }
}
