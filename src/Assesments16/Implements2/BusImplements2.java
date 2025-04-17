package Assesments16.Implements2;

import Assesments16.Interfaces.Bus;
import Assesments16.Interfaces.Train;

public class BusImplements2 implements Bus, Train {
    @Override
    public void behaviour() {
        System.out.println("running bus behaviour in implements");
    }
    @Override
    public void properties() {
        System.out.println("running properties in implements");
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
