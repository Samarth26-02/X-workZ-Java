package Assesments13;

public class VRHeadset {
    String brand;
    boolean isStandalone;
    int fieldOfView;

    public VRHeadset(String brand, boolean isStandalone, int fieldOfView) {
        this.brand = brand;
        this.isStandalone = isStandalone;
        this.fieldOfView = fieldOfView;
    }

    public String toString() {
        return "VRHeadset: " + brand + ", Standalone? " + isStandalone + ", FOV: " + fieldOfView + "°";
    }
}
