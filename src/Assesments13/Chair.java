package Assesments13;

public class Chair {
    String material;
    String color;
    boolean hasCushion;

    public Chair(String material, String color, boolean hasCushion) {
        this.material = material;
        this.color = color;
        this.hasCushion = hasCushion;
    }

    public String toString() {
        return "Chair: " + color + " " + material + " with cushion? " + hasCushion;
    }
}
