package Assesments10;

public class BackpackRunner {
    public static void main(String[] args) {
        Backpack backpack = new Backpack();
        backpack.capacity();
        backpack.color();
        backpack.compartments();
        backpack.material();
        backpack.waterResistance();
        System.out.println("---------------");

        Backpack backpack1 = new BackpackDetails();
        backpack1.waterResistance();
        backpack1.material();
        backpack1.compartments();
        backpack1.color();
        backpack1.capacity();
        System.out.println("---------------");

        BackpackDetails backpackDetails = new BackpackDetails();
        backpackDetails.capacity();
        backpackDetails.color();
        backpackDetails.compartments();
        backpackDetails.material();
        backpackDetails.waterResistance();
        backpackDetails.extraPockets();
        System.out.println("---------------");

        BackpackCast backpackCast = new BackpackCast();
        backpackCast.castBackpack(backpack);
        backpackCast.castBackpack(backpack1);
    }
}
