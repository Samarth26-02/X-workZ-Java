package Assesments13;

public class Oven {
    String brand;
    int temperatureRange;
    boolean isConvection;

    public Oven(String brand, int temperatureRange, boolean isConvection) {
        this.brand = brand;
        this.temperatureRange = temperatureRange;
        this.isConvection = isConvection;
    }

    public String toString() {
        return "Oven: " + brand + ", Temp Range: " + temperatureRange + "°C, Convection? " + isConvection;
    }
}
