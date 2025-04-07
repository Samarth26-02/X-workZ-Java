package Assesments10;

public class EventCast {
    public void castEvent(Event event) {
        event.schedule();
        event.announce();
        event.start();
        event.end();
        event.summarize();

        if (event instanceof EventDetails) {
            System.out.println("Casting to EventDetails...");
            EventDetails details = (EventDetails) event;
            details.logistics();
        }
    }
}