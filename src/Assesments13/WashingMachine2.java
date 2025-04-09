package Assesments13;

public class WashingMachine2 {
    String brand;
    int capacity;
    String loadType;

    public WashingMachine2(String brand, int capacity, String loadType) {
        this.brand = brand;
        this.capacity = capacity;
        this.loadType = loadType;
    }

    @Override
    public String toString() {
        return "WashingMachine2 [brand=" + brand + ", capacity=" + capacity + ", loadType=" + loadType + "]";
    }
}
