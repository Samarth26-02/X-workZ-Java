package Assesments10;

public class WorkoutDetails extends Workout{
    @Override
    public void startSession(){
        System.out.println("Start workout session");
    }
    @Override
    public void endSession(){
        System.out.println("End workout session");
    }
    @Override
    public void trackCalories(){
        System.out.println("Track calories");
    }
    @Override
    public void showDuration(){
        System.out.println("Workout duration");
    }
    @Override
    public void saveProggress(){
        System.out.println("Save workout progress");
    }
}
