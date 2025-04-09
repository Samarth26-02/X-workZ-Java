package Assesments13;

public class AirFryer {
    String brand;
    int basketCapacity;
    boolean hasDigitalDisplay;

    public AirFryer(String brand, int basketCapacity, boolean hasDigitalDisplay) {
        this.brand = brand;
        this.basketCapacity = basketCapacity;
        this.hasDigitalDisplay = hasDigitalDisplay;
    }

    public String toString() {
        return "AirFryer: " + brand + ", Basket: " + basketCapacity + "L, Digital Display? " + hasDigitalDisplay;
    }
}
