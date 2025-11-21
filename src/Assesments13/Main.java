
package Assesments13;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car(4, 5);
        myCar.displayDetails();  // Final method from Vehicle
        myCar.fuelType();        // Overridden method in Car
    }
}
