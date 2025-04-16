package Assesments16.Implements1;

import Assesments16.Interfaces.Hammer;

public class HammerImplements1 implements Hammer {
    @Override
    public void behaviour() {
        System.out.println("running hammer behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running hammer identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running hammer state in implements");
    }
}
