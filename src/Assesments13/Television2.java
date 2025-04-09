package Assesments13;

public class Television2 {
    String brand;
    int sizeInches;
    boolean isSmart;

    public Television2(String brand, int sizeInches, boolean isSmart) {
        this.brand = brand;
        this.sizeInches = sizeInches;
        this.isSmart = isSmart;
    }

    public String toString() {
        return "Television: " + brand + ", Size: " + sizeInches + "in, Smart? " + isSmart;
    }
}
