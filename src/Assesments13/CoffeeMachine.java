package Assesments13;

public class CoffeeMachine {
    String brand;
    boolean automatic;
    int cupCapacity;

    public CoffeeMachine(String brand, boolean automatic, int cupCapacity) {
        this.brand = brand;
        this.automatic = automatic;
        this.cupCapacity = cupCapacity;
    }

    public String toString() {
        return "CoffeeMachine: " + brand + ", Automatic? " + automatic + ", Capacity: " + cupCapacity + " cups";
    }
}
