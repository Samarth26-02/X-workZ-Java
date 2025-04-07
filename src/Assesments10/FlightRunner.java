// FlightRunner.java
package Assesments10;

public class FlightRunner {
    public static void main(String[] args) {
        Flight flight = new Flight();
        flight.book();
        flight.checkIn();
        flight.board();
        flight.track();
        flight.cancel();

        System.out.println("----------------------");

        Flight flight1 = new FlightDetails();
        flight1.cancel();
        flight1.track();
        flight1.board();
        flight1.checkIn();
        flight1.book();

        System.out.println("----------------------");

        FlightDetails flightDetails = new FlightDetails();
        flightDetails.book();
        flightDetails.cancel();
        flightDetails.track();
        flightDetails.board();
        flightDetails.checkIn();
        flightDetails.selectSeat();

        System.out.println("----------------------");

        FlightCast flightCast = new FlightCast();
        flightCast.castFlight(flight);
        System.out.println("----------------------");
        flightCast.castFlight(flightDetails);
    }
}