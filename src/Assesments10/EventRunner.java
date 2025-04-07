package Assesments10;

public class EventRunner {
    public static void main(String[] args) {
        Event genericEvent = new Event();
        genericEvent.schedule();
        genericEvent.announce();
        genericEvent.start();
        genericEvent.end();
        genericEvent.summarize();

        System.out.println("-------------");

        EventDetails detailedEvent = new EventDetails();
        detailedEvent.schedule();
        detailedEvent.announce();
        detailedEvent.start();
        detailedEvent.end();
        detailedEvent.summarize();
        detailedEvent.logistics();

        System.out.println("-------------");

        Event event = new Event();
        event.schedule();
        event.announce();
        event.start();
        event.end();
        event.summarize();

        System.out.println("-------------");

        EventCast eventCast = new EventCast();
        eventCast.castEvent(genericEvent);
        System.out.println("-------------");
        eventCast.castEvent(detailedEvent);
    }
}