package Assesments10;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.start();
        vehicle.accelerate();
        vehicle.refuel();
        vehicle.destination();
        vehicle.stop();
        System.out.println("-----------------");
        Vehicle vehicle1=new VehicleDetails();
        vehicle1.start();
        vehicle1.accelerate();
        vehicle1.refuel();
        vehicle1.destination();
        vehicle1.stop();
    }
}
