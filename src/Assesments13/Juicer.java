package Assesments13;

public class Juicer {
    String brand;
    boolean isCentrifugal;
    int motorWatt;

    public Juicer(String brand, boolean isCentrifugal, int motorWatt) {
        this.brand = brand;
        this.isCentrifugal = isCentrifugal;
        this.motorWatt = motorWatt;
    }

    public String toString() {
        return "Juicer: " + brand + ", Centrifugal? " + isCentrifugal + ", Power: " + motorWatt + "W";
    }
}
