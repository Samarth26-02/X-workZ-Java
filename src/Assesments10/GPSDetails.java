// GPSDetails.java
package Assesments10;

public class GPSDetails extends GPS {
    @Override
    public void findLocation() {
        System.out.println("Finding current location with high accuracy");
    }

    @Override
    public void setDestination() {
        System.out.println("Setting destination with detailed preferences");
    }

    @Override
    public void startNavigation() {
        System.out.println("Starting navigation with voice guidance");
    }

    @Override
    public void recalculateRoute() {
        System.out.println("Recalculating route with traffic updates");
    }

    @Override
    public void stopNavigation() {
        System.out.println("Stopping navigation and showing summary");
    }

    public void showMap() {
        System.out.println("Displaying map with current route");
    }
}