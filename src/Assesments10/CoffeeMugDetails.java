package Assesments10;

public class CoffeeMugDetails extends CoffeeMug {
    @Override
    public void material() {
        System.out.println("Ceramic");
    }

    @Override
    public void color() {
        System.out.println("White");
    }

    @Override
    public void capacity() {
        System.out.println("12 ounces");
    }

    @Override
    public void hasHandle() {
        System.out.println("Yes");
    }

    @Override
    public void dishwasherSafe() {
        System.out.println("Yes");
    }

    public void microwaveSafe() {
        System.out.println("Microwave Safe: Yes");
    }
}
