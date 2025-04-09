package Assesments13;

public class Desk {
    String material;
    double width;
    double height;

    public Desk(String material, double width, double height) {
        this.material = material;
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return "Desk: " + material + ", Width: " + width + "ft, Height: " + height + "ft";
    }
}
