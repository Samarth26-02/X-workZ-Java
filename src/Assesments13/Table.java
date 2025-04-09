package Assesments13;

public class Table {
    String material;
    int legs;
    double height;

    public Table(String material, String legs, double height) {
        this.material = material;
        this.legs = legs;
        this.height = height;
    }

    public String toString() {
        return "Table: " + material + " with " + legs + " legs, " + height + "ft high";
    }
}
