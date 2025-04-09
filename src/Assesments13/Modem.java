package Assesments13;

public class Modem {
    String brand;
    String connectionType;
    boolean supportsVoIP;

    public Modem(String brand, String connectionType, boolean supportsVoIP) {
        this.brand = brand;
        this.connectionType = connectionType;
        this.supportsVoIP = supportsVoIP;
    }

    public String toString() {
        return "Modem: " + brand + ", Type: " + connectionType + ", VoIP? " + supportsVoIP;
    }
}
