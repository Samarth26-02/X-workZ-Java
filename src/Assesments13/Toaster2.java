package Assesments13;

public class Toaster2 {
    String brand;
    int sliceCapacity;
    boolean hasBrowningControl;

    public Toaster2(String brand, int sliceCapacity, boolean hasBrowningControl) {
        this.brand = brand;
        this.sliceCapacity = sliceCapacity;
        this.hasBrowningControl = hasBrowningControl;
    }

    public String toString() {
        return "Toaster: " + brand + ", Slice Capacity: " + sliceCapacity + ", Browning Control? " + hasBrowningControl;
    }
}
