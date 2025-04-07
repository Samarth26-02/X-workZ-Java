package Assesments10;

public class CalendarEventRunner {
    public static void main(String[] args) {
        CalendarEvent event = new CalendarEvent();
        event.schedule();
        event.viewDetails();
        event.update();
        event.cancel();
        event.remind();

        System.out.println("----------------------");

        CalendarEvent event1 = new CalendarEventDetails();
        event1.remind();
        event1.cancel();
        event1.update();
        event1.viewDetails();
        event1.schedule();

        System.out.println("----------------------");

        CalendarEventDetails eventDetails = new CalendarEventDetails();
        eventDetails.schedule();
        eventDetails.remind();
        eventDetails.cancel();
        eventDetails.update();
        eventDetails.viewDetails();
        eventDetails.setLocation();

        System.out.println("----------------------");

        CalendarEventCast cast = new CalendarEventCast();
        cast.castCalendar(event);
        cast.castCalendar(event1);
    }
}
