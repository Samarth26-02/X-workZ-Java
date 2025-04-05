// CalendarEventDetails.java
package Assesments10;

public class CalendarEventDetails extends CalendarEvent {
    @Override
    public void schedule() {
        System.out.println("Scheduling detailed calendar event");
    }

    @Override
    public void viewDetails() {
        System.out.println("Viewing detailed calendar event details");
    }

    @Override
    public void update() {
        System.out.println("Updating detailed calendar event");
    }

    @Override
    public void cancel() {
        System.out.println("Canceling detailed calendar event");
    }

    @Override
    public void remind() {
        System.out.println("Setting detailed reminder for calendar event");
    }
}