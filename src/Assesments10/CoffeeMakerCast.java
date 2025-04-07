package Assesments10;

public class CoffeeMakerCast {
    public void castCoffee(CoffeeMaker maker) {
        maker.brand();
        maker.model();
        maker.waterReservoirCapacity();
        maker.strength();
        maker.color();

        if (maker instanceof CoffeeMakerDetails) {
            System.out.println("maker casting");
            CoffeeMakerDetails details = (CoffeeMakerDetails) maker;
            details.brewSpecialCoffee();
        }
    }
}
