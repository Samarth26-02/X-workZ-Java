package Assesments10;

public class CoffeeMugCast {
    public void castMug(CoffeeMug mug) {
        mug.material();
        mug.color();
        mug.capacity();
        mug.hasHandle();
        mug.dishwasherSafe();

        if (mug instanceof CoffeeMugDetails) {
            System.out.println("Casting to CoffeeMugDetails...");
            CoffeeMugDetails details = (CoffeeMugDetails) mug;
            details.microwaveSafe();
        }
    }
}
