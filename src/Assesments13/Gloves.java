package Assesments13;

public class Gloves {
    String brand;
    String resolution;
    String lumens;

    public Gloves(String brand, String resolution, String lumens) {
        this.brand = brand;
        this.resolution = resolution;
        this.lumens = lumens;
    }

    public String toString() {
        return "Projector: " + brand + ", Resolution: " + resolution + ", Lumens: " + lumens;
    }
}
