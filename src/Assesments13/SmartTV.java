package Assesments13;

public class SmartTV {
    String brand;
    int screenSizeInches;
    boolean is4K;

    public SmartTV(String brand, int screenSizeInches, boolean is4K) {
        this.brand = brand;
        this.screenSizeInches = screenSizeInches;
        this.is4K = is4K;
    }

    public String toString() {
        return "SmartTV: " + brand + ", Size: " + screenSizeInches + "in, 4K? " + is4K;
    }
}
