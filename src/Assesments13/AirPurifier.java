package Assesments13;

public class AirPurifier {
    String brand;
    int coverageAreaSqft;
    boolean hasHEPAFilter;

    public AirPurifier(String brand, int coverageAreaSqft, boolean hasHEPAFilter) {
        this.brand = brand;
        this.coverageAreaSqft = coverageAreaSqft;
        this.hasHEPAFilter = hasHEPAFilter;
    }

    public String toString() {
        return "AirPurifier: " + brand + ", Area: " + coverageAreaSqft + " sqft, HEPA Filter? " + hasHEPAFilter;
    }
}
