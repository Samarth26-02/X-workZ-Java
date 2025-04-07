package Assesments10;

public class GPSCast {
    public void castGPS(GPS gps) {
        gps.findLocation();
        gps.setDestination();
        gps.startNavigation();
        gps.recalculateRoute();
        gps.stopNavigation();

        if (gps instanceof GPSDetails) {
            System.out.println("Casting to GPSDetails...");
            GPSDetails details = (GPSDetails) gps;
            details.showMap();
        }
    }
}