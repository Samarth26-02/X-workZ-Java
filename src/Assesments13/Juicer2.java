package Assesments13;

public class Juicer2 {
    String brand;
    int powerWatt;
    boolean isColdPress;

    public Juicer2(String brand, int powerWatt, boolean isColdPress) {
        this.brand = brand;
        this.powerWatt = powerWatt;
        this.isColdPress = isColdPress;
    }

    public String toString() {
        return "Juicer: " + brand + ", Power: " + powerWatt + "W, Cold Press? " + isColdPress;
    }
}
