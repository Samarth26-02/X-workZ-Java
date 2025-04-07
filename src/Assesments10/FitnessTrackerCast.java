package Assesments10;

public class FitnessTrackerCast {
    public void castTracker(FitnessTracker tracker) {
        tracker.startWorkout();
        tracker.logActivity();
        tracker.endWorkout();
        tracker.viewSummary();
        tracker.setGoal();

        if (tracker instanceof FitnessTrackerDetails) {
            System.out.println("Casting to FitnessTrackerDetails...");
            FitnessTrackerDetails details = (FitnessTrackerDetails) tracker;
            details.monitorHeartRate();
        }
    }
}