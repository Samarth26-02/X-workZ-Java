package Assesments13;

public class Dishwasher {
    String brand;
    int placeSettings;
    boolean hasEcoMode;

    public Dishwasher(String brand, int placeSettings, boolean hasEcoMode) {
        this.brand = brand;
        this.placeSettings = placeSettings;
        this.hasEcoMode = hasEcoMode;
    }

    public String toString() {
        return "Dishwasher: " + brand + ", Place Settings: " + placeSettings + ", Eco Mode? " + hasEcoMode;
    }
}
