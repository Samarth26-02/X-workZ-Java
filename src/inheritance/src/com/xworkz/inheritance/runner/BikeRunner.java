package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.internal.Bike;
import com.xworkz.inheritance.internal.Vehicle;

public class BikeRunner {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.brake();
        vehicle.accelerate();
        vehicle.startEngine();

        Bike bike = new Bike();
        bike.honk();
        bike.stopEngine();
    }
}
