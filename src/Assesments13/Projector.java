package Assesments13;

public class Projector {
    String brand;
    int lumens;
    boolean is4K;

    public Projector(String brand, int lumens, boolean is4K) {
        this.brand = brand;
        this.lumens = lumens;
        this.is4K = is4K;
    }

    public String toString() {
        return "Projector: " + brand + ", " + lumens + " lumens, 4K? " + is4K;
    }
}
