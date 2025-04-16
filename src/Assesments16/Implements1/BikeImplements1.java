package Assesments16.Implements1;

import Assesments16.Interfaces.Bike;

public class BikeImplements1 implements Bike {
    @Override
    public void behaviour() {
        System.out.println("running bike behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running bike identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running bike state in implements");
    }
}
