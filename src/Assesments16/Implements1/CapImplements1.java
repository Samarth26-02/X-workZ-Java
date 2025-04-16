package Assesments16.Implements1;

import Assesments16.Interfaces.Cap;

public class CapImplements1 implements Cap {
    @Override
    public void behaviour() {
        System.out.println("running cap behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running cap identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running cap state in implements");
    }
}
