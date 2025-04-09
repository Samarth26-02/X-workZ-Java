package Assesments13;

public class Helmet {
    String brand;
    String color;
    boolean isFullFace;

    public Helmet(String brand, String color, boolean isFullFace) {
        this.brand = brand;
        this.color = color;
        this.isFullFace = isFullFace;
    }

    public String toString() {
        return "Helmet: " + brand + ", Color: " + color + ", Full Face? " + isFullFace;
    }
}

