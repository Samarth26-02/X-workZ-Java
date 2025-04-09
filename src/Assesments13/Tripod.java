package Assesments13;

public class Tripod {
    String brand;
    int resolution;
    int lumens;

    public Tripod(String brand, int resolution, int lumens) {
        this.brand = brand;
        this.resolution = resolution;
        this.lumens = lumens;
    }

    public String toString() {
        return "Projector: " + brand + ", Resolution: " + resolution + ", Lumens: " + lumens;
    }
}
