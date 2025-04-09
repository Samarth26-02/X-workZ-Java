package Assesments13;

public class Light {
    String brand;
    String resolution;
    int lumens;

    public Light(String brand, String resolution, int lumens) {
        this.brand = brand;
        this.resolution = resolution;
        this.lumens = lumens;
    }

    public String toString() {
        return "Light: " + brand + ", Resolution: " + resolution + ", Lumens: " + lumens;
    }
}
