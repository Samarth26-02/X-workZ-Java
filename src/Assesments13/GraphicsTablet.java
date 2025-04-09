package Assesments13;

public class GraphicsTablet {
    String brand;
    boolean hasDisplay;
    int pressureLevels;

    public GraphicsTablet(String brand, boolean hasDisplay, int pressureLevels) {
        this.brand = brand;
        this.hasDisplay = hasDisplay;
        this.pressureLevels = pressureLevels;
    }

    public String toString() {
        return "GraphicsTablet: " + brand + ", Display? " + hasDisplay + ", Pressure Levels: " + pressureLevels;
    }
}
