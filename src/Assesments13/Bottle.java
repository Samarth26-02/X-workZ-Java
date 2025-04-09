package Assesments13;

public class Bottle {
    String material;
    double capacity;
    boolean insulated;

    public Bottle(String material, double capacity, String insulated) {
        this.material = material;
        this.capacity = capacity;
        this.insulated = insulated;
    }

    public String toString() {
        return "Bottle: " + material + ", " + capacity + "L, Insulated? " + insulated;
    }
}
