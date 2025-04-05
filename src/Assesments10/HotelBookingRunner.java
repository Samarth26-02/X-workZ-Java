// HotelBookingRunner.java
package Assesments10;

public class HotelBookingRunner {
    public static void main(String[] args) {
        HotelBooking booking = new HotelBooking();
        booking.bookRoom();
        booking.cancelBooking();
        booking.checkAvailability();
        booking.viewDetails();
        booking.checkIn();

        System.out.println("----------------------");

        HotelBooking booking1 = new HotelBookingDetails();
        booking1.checkIn();
        booking1.viewDetails();
        booking1.checkAvailability();
        booking1.cancelBooking();
        booking1.bookRoom();

        System.out.println("----------------------");

        HotelBookingDetails bookingDetails = new HotelBookingDetails();
        bookingDetails.bookRoom();
        bookingDetails.checkIn();
        bookingDetails.viewDetails();
        bookingDetails.checkAvailability();
        bookingDetails.cancelBooking();
    }
}