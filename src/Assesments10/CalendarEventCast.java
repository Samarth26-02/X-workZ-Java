package Assesments10;

public class CalendarEventCast {
    public void castCalendar(CalendarEvent event) {
        event.schedule();
        event.viewDetails();
        event.update();
        event.cancel();
        event.remind();

        if (event instanceof CalendarEventDetails) {
            System.out.println("calendar casting");
            CalendarEventDetails details = (CalendarEventDetails) event;
            details.setLocation();
        }
    }
}
