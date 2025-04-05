// FlightDetails.java
package Assesments10;

public class FlightDetails extends Flight {
    @Override
    public void book() {
        System.out.println("Booking detailed flight");
    }

    @Override
    public void checkIn() {
        System.out.println("Checking in for detailed flight");
    }

    @Override
    public void board() {
        System.out.println("Boarding detailed flight");
    }

    @Override
    public void track() {
        System.out.println("Tracking detailed flight");
    }

    @Override
    public void cancel() {
        System.out.println("Canceling detailed flight");
    }
}