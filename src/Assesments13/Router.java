package Assesments13;

public class Router {
    String brand;
    double maxSpeedMbps;
    int antennas;

    public Router(String brand, double maxSpeedMbps, int antennas) {
        this.brand = brand;
        this.maxSpeedMbps = maxSpeedMbps;
        this.antennas = antennas;
    }

    public String toString() {
        return "Router: " + brand + ", " + maxSpeedMbps + " Mbps, Antennas: " + antennas;
    }
}
