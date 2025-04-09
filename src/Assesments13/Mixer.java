package Assesments13;

public class Mixer {
    String brand;
    int jarCount;
    boolean isMultiSpeed;

    public Mixer(String brand, int jarCount, boolean isMultiSpeed) {
        this.brand = brand;
        this.jarCount = jarCount;
        this.isMultiSpeed = isMultiSpeed;
    }

    public String toString() {
        return "Mixer: " + brand + ", Jars: " + jarCount + ", Multi-Speed? " + isMultiSpeed;
    }
}
