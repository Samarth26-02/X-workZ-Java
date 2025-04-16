package Assesments16.Implements1;

import Assesments16.Interfaces.Satelite;

public class SatelliteImplements1 implements Satelite {
    @Override
    public void behaviour() {
        System.out.println("running satelite behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running satelite identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running satelite state in implements");
    }
}
