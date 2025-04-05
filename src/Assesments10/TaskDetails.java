package Assesments10;

public class TaskDetails extends Task{
    @Override
    public void start() {
        System.out.println("Starting background task");
    }

    @Override
    public void execute() {
        System.out.println("Executing background task");
    }

    @Override
    public void pause() {
        System.out.println("Pausing background task");
    }

    @Override
    public void resume() {
        System.out.println("Resuming background task");
    }

    @Override
    public void finish() {
        System.out.println("Finishing background task");
    }
}
