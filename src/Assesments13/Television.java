package Assesments13;

public class Television {
    String brand;
    int sizeInInches;
    boolean isSmartTV;

    public Television(String brand, int sizeInInches, boolean isSmartTV) {
        this.brand = brand;
        this.sizeInInches = sizeInInches;
        this.isSmartTV = isSmartTV;
    }

    public String toString() {
        return "Television: " + brand + " " + sizeInInches + "\" SmartTV? " + isSmartTV;
    }
}
