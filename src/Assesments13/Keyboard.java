package Assesments13;

public class Keyboard {
    String brand;
    boolean mechanical;
    String layout;

    public Keyboard(String brand, boolean mechanical, String layout) {
        this.brand = brand;
        this.mechanical = mechanical;
        this.layout = layout;
    }

    public String toString() {
        return "Keyboard: " + brand + ", Mechanical? " + mechanical + ", Layout: " + layout;
    }
}
