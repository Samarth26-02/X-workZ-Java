package Assesments10;

public class VehicleDetails extends Vehicle{
    @Override
    public void start(){
        System.out.println("Start the vehicle");
    }
    @Override
    public void stop(){
        System.out.println("Stop the vehicle");
    }
    @Override
    public void accelerate(){
        System.out.println("Give accelerate");
    }
    @Override
    public void refuel(){
        System.out.println("Refuel the vehicle");
    }
    @Override
    public void destination(){
        System.out.println("Reach the destination");
    }
}
