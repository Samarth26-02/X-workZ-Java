package Assesments13;

public class Mouse {
    String brand;
    boolean wireless;
    int dpi;

    public Mouse(String brand, boolean wireless, String dpi) {
        this.brand = brand;
        this.wireless = wireless;
        this.dpi = dpi;
    }

    public String toString() {
        return "Mouse: " + brand + ", Wireless? " + wireless + ", DPI: " + dpi;
    }
}
