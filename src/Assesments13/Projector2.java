package Assesments13;

public class Projector2 {
    String brand;
    int lumens;
    boolean isPortable;

    public Projector2(String brand, int lumens, boolean isPortable) {
        this.brand = brand;
        this.lumens = lumens;
        this.isPortable = isPortable;
    }

    public String toString() {
        return "Projector: " + brand + ", Lumens: " + lumens + ", Portable? " + isPortable;
    }
}
