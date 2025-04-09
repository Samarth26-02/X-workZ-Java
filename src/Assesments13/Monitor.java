package Assesments13;

public class Monitor {
    String brand;
    int sizeInches;
    boolean isCurved;

    public Monitor(String brand, int sizeInches, boolean isCurved) {
        this.brand = brand;
        this.sizeInches = sizeInches;
        this.isCurved = isCurved;
    }

    public String toString() {
        return "Monitor: " + brand + ", " + sizeInches + " inches, Curved? " + isCurved;
    }
}

