package Assesments16.Implements5;

import Assesments16.Interfaces.*;

public class BikeImplements5 implements Bike, Bus, Train, Airplane, Ship {
    @Override
    public void behaviour() {
        System.out.println("running  behaviour in implements");
    }

    @Override
    public void properties() {
        System.out.println("running properties in implements");
    }

    @Override
    public void identity() {
        System.out.println("running  identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running  state in implements");
    }
}
