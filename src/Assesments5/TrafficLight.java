package Assesment5;

public class TrafficLight {
    Road road = new Road();

    public void RoadDetails() {
        System.out.println("Road name: " + road.roadName);
        System.out.println("Speed limit: " + road.speedLimit);
        System.out.println("City: " + road.city);

        road.showRoadName();
        road.showSpeedLimit();
        road.showCity();
    }
}
