package Assesments13;

public class FitnessTracker {
    String brand;
    int stepGoal;
    boolean hasHeartRateMonitor;

    public FitnessTracker(String brand, int stepGoal, boolean hasHeartRateMonitor) {
        this.brand = brand;
        this.stepGoal = stepGoal;
        this.hasHeartRateMonitor = hasHeartRateMonitor;
    }

    public String toString() {
        return "FitnessTracker: " + brand + ", Step Goal: " + stepGoal + ", Heart Rate? " + hasHeartRateMonitor;
    }
}
