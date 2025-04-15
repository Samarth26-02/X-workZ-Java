package Assesments13;

public class Vehicle {
    final int wheels;      // final variable
    final int capacity;    // final variable

    // Constructor to initialize the two final variables
    public Vehicle(int wheels, int capacity) {
        this.wheels = wheels;
        this.capacity = capacity;
    }

    // Final method to prevent overriding
    public final void displayDetails() {
        System.out.println("Wheels: " + wheels);
        System.out.println("Capacity: " + capacity + " people");
    }

    public void fuelType() {
        System.out.println("Generic fuel.");
    }
}
