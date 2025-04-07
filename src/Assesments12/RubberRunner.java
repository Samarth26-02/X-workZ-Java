package Assesments12;

public class RubberRunner {
    public static void main(String[] args) {
        Rubber rubber=new Rubber();
        rubber.expand();
        Rubber rubber1=new Tyre();
        rubber1.expand();
        Tyre tyre=new Tyre();
        tyre.expand();
        tyre.compress();
        MRFTyre mrfTyre=new MRFTyre();

        ArmyVehicle armyVehicle=new ArmyVehicle();
        armyVehicle.wheel(rubber);
        armyVehicle.wheel(rubber1);
        armyVehicle.wheel(tyre);
        armyVehicle.wheel(mrfTyre);
    }
}
