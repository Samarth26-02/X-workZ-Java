
package Assesment6;

import Assesment5.Road;

public class Pedestrian {
    Road road = new Road();

    void accessRoadDetails() {
        System.out.println("Pedestrian sees road name: " + road.roadName);
        System.out.println("Pedestrian sees city: " + road.city);

        road.showRoadName();
        road.showCity();
    }
}
