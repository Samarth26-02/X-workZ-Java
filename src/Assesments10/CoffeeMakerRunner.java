package Assesments10;

public class CoffeeMakerRunner {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.brand();
        coffeeMaker.model();
        coffeeMaker.waterReservoirCapacity();
        coffeeMaker.strength();
        coffeeMaker.color();

        System.out.println("-------------");

        CoffeeMaker coffeeMaker1 = new CoffeeMakerDetails();
        coffeeMaker1.brand();
        coffeeMaker1.model();
        coffeeMaker1.waterReservoirCapacity();
        coffeeMaker1.strength();
        coffeeMaker1.color();

        System.out.println("-------------");

        CoffeeMakerDetails coffeeMakerDetails = new CoffeeMakerDetails();
        coffeeMakerDetails.brand();
        coffeeMakerDetails.color();
        coffeeMakerDetails.model();
        coffeeMakerDetails.strength();
        coffeeMakerDetails.waterReservoirCapacity();
        coffeeMakerDetails.brewSpecialCoffee();

        System.out.println("-------------");

        CoffeeMakerCast cast = new CoffeeMakerCast();
        cast.castCoffee(coffeeMaker);
        cast.castCoffee(coffeeMaker1);
    }
}
