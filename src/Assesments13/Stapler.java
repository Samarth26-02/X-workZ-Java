package Assesments13;

public class Stapler {
    String brand;
    int sheetCapacity;
    boolean hasStapleRemover;

    public Stapler(String brand, int sheetCapacity, boolean hasStapleRemover) {
        this.brand = brand;
        this.sheetCapacity = sheetCapacity;
        this.hasStapleRemover = hasStapleRemover;
    }

    public String toString() {
        return "Stapler: " + brand + ", Capacity: " + sheetCapacity + " sheets, Remover? " + hasStapleRemover;
    }
}

