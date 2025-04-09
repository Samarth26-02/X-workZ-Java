package Assesments13;

public class Bag {
    String brand;
    int liters;
    boolean laptoppocket

    public Bag(String brand, int liters, boolean laptoppocket) {
        this.brand = brand;
        this.liters=liters;
        this.laptoppocket=laptoppocket;
    }

    public String toString() {
        return "Bag: " + brand + ", Liter: " + liters + ", Laptop pocket: " + laptoppocket;
    }
}
