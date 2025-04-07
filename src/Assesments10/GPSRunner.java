// GPSRunner.java
package Assesments10;

public class GPSRunner {
    public static void main(String[] args) {
        GPS gps = new GPS();
        gps.findLocation();
        gps.setDestination();
        gps.startNavigation();
        gps.recalculateRoute();
        gps.stopNavigation();

        System.out.println("----------------------");

        GPS gps1 = new GPSDetails();
        gps1.stopNavigation();
        gps1.recalculateRoute();
        gps1.startNavigation();
        gps1.setDestination();
        gps1.findLocation();

        System.out.println("----------------------");

        GPSDetails gpsDetails = new GPSDetails();
        gpsDetails.findLocation();
        gpsDetails.stopNavigation();
        gpsDetails.recalculateRoute();
        gpsDetails.startNavigation();
        gpsDetails.setDestination();
        gpsDetails.showMap();

        System.out.println("----------------------");

        GPSCast gpsCast = new GPSCast();
        gpsCast.castGPS(gps);
        System.out.println("----------------------");
        gpsCast.castGPS(gpsDetails);
    }
}