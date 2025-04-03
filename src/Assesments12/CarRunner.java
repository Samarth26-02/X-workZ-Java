package Assesments12;

public class CarRunner {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.brake();
        vehicle.accelerate();
        vehicle.startEngine();

        Car car = new Car();
        car.honk();
        car.stopEngine();
    }
}
