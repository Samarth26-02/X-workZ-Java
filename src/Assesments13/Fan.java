package Assesments13;

public class Fan {
    String type;
    int speedLevels;
    boolean isRemoteControlled;

    public Fan(String type, int speedLevels, boolean isRemoteControlled) {
        this.type = type;
        this.speedLevels = speedLevels;
        this.isRemoteControlled = isRemoteControlled;
    }

    public String toString() {
        return "Fan: " + type + ", Speeds: " + speedLevels + ", Remote? " + isRemoteControlled;
    }
}
