package Assesments13;

public class Toaster {
    String brand;
    int sliceCapacity;
    boolean hasTimer;

    public Toaster(String brand, int sliceCapacity, boolean hasTimer) {
        this.brand = brand;
        this.sliceCapacity = sliceCapacity;
        this.hasTimer = hasTimer;
    }

    public String toString() {
        return "Toaster: " + brand + ", Capacity: " + sliceCapacity + " slices, Timer? " + hasTimer;
    }
}
