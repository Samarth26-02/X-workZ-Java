package Assesments13;

public class Bicycle {
    String type;
    int gearCount;
    String frameMaterial;

    public Bicycle(String type, int gearCount, String frameMaterial) {
        this.type = type;
        this.gearCount = gearCount;
        this.frameMaterial = frameMaterial;
    }

    public String toString() {
        return "Bicycle: " + type + ", Gears: " + gearCount + ", Frame: " + frameMaterial;
    }
}
