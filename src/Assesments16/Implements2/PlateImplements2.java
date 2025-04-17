package Assesments16.Implements2;

import Assesments16.Interfaces.Plate;
import Assesments16.Interfaces.Spoon;

public class PlateImplements2 implements Plate, Spoon {
    @Override
    public void behaviour() {
        System.out.println("running plate behaviour in implements");
    }
    @Override
    public void properties() {
        System.out.println("running properties in implements");
    }
    @Override
    public void identity() {
        System.out.println("running plate identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running plate state in implements");
    }
}
