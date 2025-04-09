package Assesments13;

public class Scanner {
    String brand;
    int resolutionDPI;
    boolean supportsADF;

    public Scanner(String brand, int resolutionDPI, boolean supportsADF) {
        this.brand = brand;
        this.resolutionDPI = resolutionDPI;
        this.supportsADF = supportsADF;
    }

    public String toString() {
        return "Scanner: " + brand + ", Resolution: " + resolutionDPI + " DPI, ADF? " + supportsADF;
    }
}
