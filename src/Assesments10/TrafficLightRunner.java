package Assesments10;

public class TrafficLightRunner {
    public static void main(String[] args) {
        TrafficLight trafficLight=new TrafficLight();
        trafficLight.lightsNo();
        trafficLight.control();
        trafficLight.mounnting();
        trafficLight.purpose();
        trafficLight.shape();
        System.out.println("-------------");
        TrafficLight trafficLight1=new TrafficLightDetails();
        trafficLight1.shape();
        trafficLight1.purpose();
        trafficLight1.mounnting();
        trafficLight1.control();
        trafficLight1.lightsNo();
        System.out.println("-------------");
        TrafficLightDetails trafficLightDetails=new TrafficLightDetails();
        trafficLightDetails.control();
        trafficLightDetails.lightsNo();
        trafficLightDetails.mounnting();
        trafficLightDetails.shape();
        trafficLightDetails.purpose();
    }
}
