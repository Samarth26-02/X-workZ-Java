package Assesments13;

public class HairDryer {
    String brand;
    int powerWatt;
    boolean hasCoolShot;

    public HairDryer(String brand, int powerWatt, boolean hasCoolShot) {
        this.brand = brand;
        this.powerWatt = powerWatt;
        this.hasCoolShot = hasCoolShot;
    }

    public String toString() {
        return "HairDryer: " + brand + ", Power: " + powerWatt + "W, Cool Shot? " + hasCoolShot;
    }
}
