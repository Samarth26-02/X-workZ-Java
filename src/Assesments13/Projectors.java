package Assesments13;

public class Projectors {
    String brand;
    String resolution;
    int lumens;

    public Projectors(String brand, String resolution, int lumens) {
        this.brand = brand;
        this.resolution = resolution;
        this.lumens = lumens;
    }

    public String toString() {
        return "Projector: " + brand + ", Resolution: " + resolution + ", Lumens: " + lumens;
    }
}
