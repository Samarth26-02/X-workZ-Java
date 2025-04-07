package Assesments10;

public class AppointmentCast {
    public void castAppointment(Appointment appointment){
        appointment.schedule();
        appointment.cancel();
        appointment.reschedule();
        appointment.sendReminder();
        appointment.viewDetails();
        if(appointment instanceof AppointmentDetails){
            System.out.println("casting appointment");
            AppointmentDetails appointmentDetails=(AppointmentDetails)appointment;
            appointmentDetails.dontRemind();
        }
    }
}
