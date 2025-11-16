
package Assesment5;

public class Road {
    public String roadName = "Main Street";
    int speedLimit = 60;
    private int numberOfLanes = 4;
    public String city = "New York";

    public void showRoadName() {
        System.out.println("Road Name: " + roadName);
    }

    void showSpeedLimit() {
        System.out.println("Speed Limit: " + speedLimit + " km/h");
    }

    private void showNumberOfLanes() {
        System.out.println("Number of Lanes: " + numberOfLanes);
    }

    public void showCity() {
        System.out.println("City: " + city);
    }
}
