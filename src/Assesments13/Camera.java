package Assesments13;

public class Camera {
    String brand;
    int megapixels;
    boolean isDSLR;

    public Camera(String brand, int megapixels, boolean isDSLR) {
        this.brand = brand;
        this.megapixels = megapixels;
        this.isDSLR = isDSLR;
    }

    public String toString() {
        return "Camera: " + brand + " " + megapixels + "MP DSLR? " + isDSLR;
    }
}
