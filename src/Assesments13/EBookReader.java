package Assesments13;

public class EBookReader {
    String brand;
    boolean isBacklit;
    int storageGB;

    public EBookReader(String brand, boolean isBacklit, int storageGB) {
        this.brand = brand;
        this.isBacklit = isBacklit;
        this.storageGB = storageGB;
    }

    public String toString() {
        return "EBookReader: " + brand + ", Backlit? " + isBacklit + ", Storage: " + storageGB + "GB";
    }
}
