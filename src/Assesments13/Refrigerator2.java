package Assesments13;

public class Refrigerator2 {
    String brand;
    int capacity;
    String type;

    public Refrigerator2(String brand, int capacity, String type) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Refrigerator2 [brand=" + brand + ", capacity=" + capacity + ", type=" + type + "]";
    }
}
