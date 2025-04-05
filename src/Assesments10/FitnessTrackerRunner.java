// FitnessTrackerRunner.java
package Assesments10;

public class FitnessTrackerRunner {
    public static void main(String[] args) {
        FitnessTracker tracker = new FitnessTracker();
        tracker.startWorkout();
        tracker.logActivity();
        tracker.endWorkout();
        tracker.viewSummary();
        tracker.setGoal();

        System.out.println("----------------------");

        FitnessTracker tracker1 = new FitnessTrackerDetails();
        tracker1.setGoal();
        tracker1.viewSummary();
        tracker1.endWorkout();
        tracker1.logActivity();
        tracker1.startWorkout();

        System.out.println("----------------------");

        FitnessTrackerDetails trackerDetails = new FitnessTrackerDetails();
        trackerDetails.startWorkout();
        trackerDetails.setGoal();
        trackerDetails.viewSummary();
        trackerDetails.endWorkout();
        trackerDetails.logActivity();
    }
}