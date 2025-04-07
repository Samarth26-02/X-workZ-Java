package Assesments10;

public class FlightCast {
    public void castFlight(Flight flight) {
        flight.book();
        flight.checkIn();
        flight.board();
        flight.track();
        flight.cancel();

        if (flight instanceof FlightDetails) {
            System.out.println("Casting to FlightDetails...");
            FlightDetails details = (FlightDetails) flight;
            details.selectSeat();
        }
    }
}