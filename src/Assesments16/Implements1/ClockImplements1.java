package Assesments16.Implements1;

import Assesments16.Interfaces.Clock;

public class ClockImplements1 implements Clock {
    @Override
    public void behaviour() {
        System.out.println("running clock behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running clock identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running clock state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running clock properties in implements");
    }
}
