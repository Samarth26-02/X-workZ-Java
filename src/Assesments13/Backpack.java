package Assesments13;

public class Backpack {
    String color;
    int compartments;
    boolean waterproof;

    public Backpack(String color, int compartments, boolean waterproof) {
        this.color = color;
        this.compartments = compartments;
        this.waterproof = waterproof;
    }

    public String toString() {
        return "Backpack: " + color + ", " + compartments + " compartments, Waterproof? " + waterproof;
    }
}
