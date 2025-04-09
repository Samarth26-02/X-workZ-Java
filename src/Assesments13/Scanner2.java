package Assesments13;

public class Scanner2 {
    String brand;
    int resolutionDPI;
    boolean isFlatbed;

    public Scanner2(String brand, int resolutionDPI, boolean isFlatbed) {
        this.brand = brand;
        this.resolutionDPI = resolutionDPI;
        this.isFlatbed = isFlatbed;
    }

    public String toString() {
        return "Scanner: " + brand + ", DPI: " + resolutionDPI + ", Flatbed? " + isFlatbed;
    }
}
