package Assesment6;

import Assesment5.TrafficLight;

public class RoadRunner {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        Pedestrian pedestrian = new Pedestrian();

        trafficLight.RoadDetails();
        pedestrian.accessRoadDetails();
    }
}
