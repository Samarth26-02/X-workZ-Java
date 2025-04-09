package Assesments13;

public class Pillow {
    String material;
    double lengthInches;
    boolean memoryFoam;

    public Pillow(String material, double lengthInches, boolean memoryFoam) {
        this.material = material;
        this.lengthInches = lengthInches;
        this.memoryFoam = memoryFoam;
    }

    public String toString() {
        return "Pillow: " + material + ", Length: " + lengthInches + "in, Memory Foam? " + memoryFoam;
    }
}
