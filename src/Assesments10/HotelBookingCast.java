package Assesments10;

public class HotelBookingCast {
    public void castBooking(HotelBooking booking) {
        booking.bookRoom();
        booking.cancelBooking();
        booking.checkAvailability();
        booking.viewDetails();
        booking.checkIn();

        if (booking instanceof HotelBookingDetails) {
            System.out.println("Casting to HotelBookingDetails...");
            HotelBookingDetails details = (HotelBookingDetails) booking;
            details.requestExtraBed();
        }
    }
}