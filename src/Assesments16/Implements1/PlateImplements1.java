package Assesments16.Implements1;

import Assesments16.Interfaces.Plate;

public class PlateImplements1 implements Plate {
    @Override
    public void behaviour() {
        System.out.println("running plate behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running plate identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running plate state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running plate properties in implements");
    }
}
