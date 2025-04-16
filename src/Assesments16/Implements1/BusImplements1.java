package Assesments16.Implements1;

import Assesments16.Interfaces.Bus;

public class BusImplements1 implements Bus {
    @Override
    public void behaviour() {
        System.out.println("running bus behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running bus identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running bus state in implements");
    }
}
