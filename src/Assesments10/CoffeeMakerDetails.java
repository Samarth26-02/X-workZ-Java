package Assesments10;

public class CoffeeMakerDetails extends CoffeeMaker {
    @Override
    public void brand() {
        System.out.println("Brand: Keurig");
    }

    @Override
    public void model() {
        System.out.println("Model: K-Elite");
    }

    @Override
    public void waterReservoirCapacity() {
        System.out.println("Water Reservoir Capacity: 75 ounces");
    }

    @Override
    public void strength() {
        System.out.println("Strength: Strong");
    }

    @Override
    public void color() {
        System.out.println("Color: Black");
    }

    public void brewSpecialCoffee() {
        System.out.println("Brewing special coffee with rich aroma...");
    }
}
