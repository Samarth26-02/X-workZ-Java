package Assesments13;

public class Sunglasses {
    String brand;
    String resolution;
    int lumens;

    public Sunglasses(String brand, String resolution, int lumens) {
        this.brand = brand;
        this.resolution = resolution;
        this.lumens = lumens;
    }

    public String toString() {
        return "Projector: " + brand + ", Resolution: " + resolution + ", Lumens: " + lumens;
    }
}
