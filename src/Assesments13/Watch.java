package Assesments13;

public class Watch {
    String brand;
    boolean isDigital;
    double price;

    public Watch(String brand, boolean isDigital, double price) {
        this.brand = brand;
        this.isDigital = isDigital;
        this.price = price;
    }

    public String toString() {
        return "Watch: " + brand + ", Digital? " + isDigital + ", $" + price;
    }
}
