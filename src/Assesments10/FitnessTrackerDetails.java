// FitnessTrackerDetails.java
package Assesments10;

public class FitnessTrackerDetails extends FitnessTracker {
    @Override
    public void startWorkout() {
        System.out.println("Starting detailed workout tracking with GPS");
    }

    @Override
    public void logActivity() {
        System.out.println("Logging detailed activity with heart rate data");
    }

    @Override
    public void endWorkout() {
        System.out.println("Ending workout tracking and calculating calories burned");
    }

    @Override
    public void viewSummary() {
        System.out.println("Viewing comprehensive workout summary with charts");
    }

    @Override
    public void setGoal() {
        System.out.println("Setting personalized fitness goal with reminders");
    }
}