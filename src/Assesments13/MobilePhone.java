package Assesments13;

public class MobilePhone {
    String brand;
    String os;
    int storageGB;

    public MobilePhone(String brand, String os, int storageGB) {
        this.brand = brand;
        this.os = os;
        this.storageGB = storageGB;
    }

    @Override
    public String toString() {
        return "MobilePhone: " + brand + " running " + os + " with " + storageGB + "GB storage";
    }
}
