package Assesments13;

public class Shoe {
    String brand;
    int size;
    String type;

    public Shoe(String brand, int size, String type) {
        this.brand = brand;
        this.size = size;
        this.type = type;
    }

    public String toString() {
        return "Shoe: " + brand + " Size " + size + " (" + type + ")";
    }
}
