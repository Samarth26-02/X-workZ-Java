package Assesments13;

public class GameConsole {
    String name;
    int storageGB;
    boolean supportsVR;

    public GameConsole(String name, int storageGB, boolean supportsVR) {
        this.name = name;
        this.storageGB = storageGB;
        this.supportsVR = supportsVR;
    }

    public String toString() {
        return "GameConsole: " + name + ", Storage: " + storageGB + "GB, VR? " + supportsVR;
    }
}

