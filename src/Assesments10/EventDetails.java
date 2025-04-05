package Assesments10;

public class EventDetails extends Event{
    @Override
    public void schedule() {
        System.out.println("Scheduling detailed event plan");
    }

    @Override
    public void announce() {
        System.out.println("Announcing event with specific details");
    }

    @Override
    public void start() {
        System.out.println("Starting event with detailed procedures");
    }

    @Override
    public void end() {
        System.out.println("Ending event with detailed closure");
    }

    @Override
    public void summarize() {
        System.out.println("Summarizing event with detailed report");
    }
}
