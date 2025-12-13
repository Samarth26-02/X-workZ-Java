
// AppointmentRunner.java
package Assesments10;

public class AppointmentRunner {
    public static void main(String[] args) {
        Appointment appointment = new Appointment();
        appointment.schedule();
        appointment.reschedule();
        appointment.cancel();
        appointment.viewDetails();
        appointment.sendReminder();

        System.out.println("----------------------");

        Appointment appointment1 = new AppointmentDetails();
        appointment1.sendReminder();
        appointment1.viewDetails();
        appointment1.cancel();
        appointment1.reschedule();
        appointment1.schedule();

        System.out.println("----------------------");

        AppointmentDetails appointmentDetails = new AppointmentDetails();
        appointmentDetails.schedule();
        appointmentDetails.sendReminder();
        appointmentDetails.viewDetails();
        appointmentDetails.cancel();
        appointmentDetails.reschedule();
        System.out.println("----------------------");
        AppointmentCast appointmentCast=new AppointmentCast();
        appointmentCast.castAppointment(appointment);
    }
}
