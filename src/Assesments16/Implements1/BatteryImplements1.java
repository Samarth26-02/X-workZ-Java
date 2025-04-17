package Assesments16.Implements1;

import Assesments16.Interfaces.Battery;

public class BatteryImplements1 implements Battery {
    @Override
    public void behaviour() {
        System.out.println("running battery behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running battery identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running battery state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running battery properties in implements");
    }
}
