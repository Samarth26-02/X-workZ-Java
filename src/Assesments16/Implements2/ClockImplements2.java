package Assesments16.Implements2;

import Assesments16.Interfaces.Clock;
import Assesments16.Interfaces.Watch;

public class ClockImplements2 implements Clock, Watch {
    @Override
    public void behaviour() {
        System.out.println("running clock behaviour in implements");
    }
    @Override
    public void properties() {
        System.out.println("running properties in implements");
    }
    @Override
    public void identity() {
        System.out.println("running clock identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running clock state in implements");
    }
}
