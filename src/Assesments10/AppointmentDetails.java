// AppointmentDetails.java
package Assesments10;

public class AppointmentDetails extends Appointment {
    @Override
    public void schedule() {
        System.out.println("Scheduling detailed appointment");
    }

    @Override
    public void reschedule() {
        System.out.println("Rescheduling detailed appointment");
    }

    @Override
    public void cancel() {
        System.out.println("Canceling detailed appointment");
    }

    @Override
    public void viewDetails() {
        System.out.println("Viewing detailed appointment details");
    }

    @Override
    public void sendReminder() {
        System.out.println("Sending detailed appointment reminder");
    }
}