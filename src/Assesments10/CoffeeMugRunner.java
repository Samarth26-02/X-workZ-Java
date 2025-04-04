package Assesments10;

public class CoffeeMugRunner {
    public static void main(String[] args) {
        CoffeeMug coffeeMug=new CoffeeMug();
        coffeeMug.capacity();
        coffeeMug.color();
        coffeeMug.dishwasherSafe();
        coffeeMug.hasHandle();
        coffeeMug.material();
        System.out.println("-----------");
        CoffeeMug coffeeMug1=new CoffeeMugDetails();
        coffeeMug1.material();
        coffeeMug1.hasHandle();
        coffeeMug1.dishwasherSafe();
        coffeeMug1.color();
        coffeeMug1.capacity();
        System.out.println("-------------");
        CoffeeMugDetails coffeeMugDetails=new CoffeeMugDetails();
        coffeeMugDetails.capacity();
        coffeeMugDetails.color();
        coffeeMugDetails.hasHandle();
        coffeeMugDetails.material();
        coffeeMugDetails.dishwasherSafe();
    }
}
