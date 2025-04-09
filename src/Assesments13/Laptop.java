package Assesments13;

public class Laptop {
    String brand;
    int processor;
    int ramGB;

    public Laptop(String brand, int processor, int ramGB) {
        this.brand = brand;
        this.processor = processor;
        this.ramGB = ramGB;
    }

    @Override
    public String toString() {
        return "Laptop: " + brand + " with " + processor + ", " + ramGB + "GB RAM";
    }
}
