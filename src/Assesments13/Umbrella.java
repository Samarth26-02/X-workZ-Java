package Assesments13;

public class Umbrella {
    String color;
    double diameterInches;
    boolean isFoldable;

    public Umbrella(String color, double diameterInches, boolean isFoldable) {
        this.color = color;
        this.diameterInches = diameterInches;
        this.isFoldable = isFoldable;
    }

    public String toString() {
        return "Umbrella: " + color + ", Diameter: " + diameterInches + "in, Foldable? " + isFoldable;
    }
}
