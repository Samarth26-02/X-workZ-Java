package Assesments13;

public class Router2 {
    String brand;
    int maxSpeedMbps;
    boolean dualBand;

    public Router2(String brand, int maxSpeedMbps, boolean dualBand) {
        this.brand = brand;
        this.maxSpeedMbps = maxSpeedMbps;
        this.dualBand = dualBand;
    }

    public String toString() {
        return "Router: " + brand + ", Max Speed: " + maxSpeedMbps + " Mbps, Dual Band? " + dualBand;
    }
}
