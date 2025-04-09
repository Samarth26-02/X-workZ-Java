package Assesments13;

public class InductionCooktop {
    String brand;
    int powerLevel;
    boolean hasTouchControls;

    public InductionCooktop(String brand, int powerLevel, boolean hasTouchControls) {
        this.brand = brand;
        this.powerLevel = powerLevel;
        this.hasTouchControls = hasTouchControls;
    }

    public String toString() {
        return "InductionCooktop: " + brand + ", Power Level: " + powerLevel + ", Touch Controls? " + hasTouchControls;
    }
}
