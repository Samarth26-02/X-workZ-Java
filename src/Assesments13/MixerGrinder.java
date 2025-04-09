package Assesments13;

public class MixerGrinder {
    String brand;
    int jarsIncluded;
    int powerWatt;

    public MixerGrinder(String brand, int jarsIncluded, int powerWatt) {
        this.brand = brand;
        this.jarsIncluded = jarsIncluded;
        this.powerWatt = powerWatt;
    }

    public String toString() {
        return "MixerGrinder: " + brand + ", Jars: " + jarsIncluded + ", Power: " + powerWatt + "W";
    }
}
