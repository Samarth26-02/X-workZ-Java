package Assesments13;

public class Pen {
    String color;
    String brand;
    double price;

    public Pen(String color, String brand, double price) {
        this.color = color;
        this.brand = brand;
        this.price = price;
    }

    public String toString() {
        return "Pen: " + brand + " " + color + " - $" + price;
    }
}
