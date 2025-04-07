package Assesments10;

public class BackpackCast {
    public void castBackpack(Backpack backpack) {
        backpack.capacity();
        backpack.color();
        backpack.compartments();
        backpack.material();
        backpack.waterResistance();

        if (backpack instanceof BackpackDetails) {
            System.out.println("backpack casting");
            BackpackDetails backpackDetails = (BackpackDetails) backpack;
            backpackDetails.extraPockets();
        }
    }
}
