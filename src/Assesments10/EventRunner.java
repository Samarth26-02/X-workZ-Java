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

        System.out.println("-------------");

        Event event = new Event();
        event.schedule();
        event.announce();
        event.start();
        event.end();
        event.summarize();
    }
}
