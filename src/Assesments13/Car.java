package Assesments13;

public class Car extends Vehicle{
    public Car(int wheels, int capacity) {
        super(wheels, capacity);
    }

    // This would cause an error if uncommented, since displayDetails is final
    /*
    @Override
    public void displayDetails() {
        System.out.println("This is a car.");
    }
    */

    @Override
    public void fuelType() {
        System.out.println("Petrol.");
    }
}
