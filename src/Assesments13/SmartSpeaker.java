package Assesments13;

public class SmartSpeaker {
    String brand;
    boolean voiceAssistant;
    int wattOutput;

    public SmartSpeaker(String brand, boolean voiceAssistant, int wattOutput) {
        this.brand = brand;
        this.voiceAssistant = voiceAssistant;
        this.wattOutput = wattOutput;
    }

    public String toString() {
        return "SmartSpeaker: " + brand + ", Voice Assistant? " + voiceAssistant + ", Power: " + wattOutput + "W";
    }
}
