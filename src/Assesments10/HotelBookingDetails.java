// HotelBookingDetails.java
package Assesments10;

public class HotelBookingDetails extends HotelBooking {
    @Override
    public void bookRoom() {
        System.out.println("Booking detailed hotel room");
    }

    @Override
    public void cancelBooking() {
        System.out.println("Canceling detailed hotel booking");
    }

    @Override
    public void checkAvailability() {
        System.out.println("Checking detailed room availability");
    }

    @Override
    public void viewDetails() {
        System.out.println("Viewing detailed booking details");
    }

    @Override
    public void checkIn() {
        System.out.println("Checking into hotel with details");
    }

    public void requestExtraBed() {
        System.out.println("Requesting an extra bed");
    }
}