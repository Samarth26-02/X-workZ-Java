package Assesments16.Implements1;

import Assesments16.Interfaces.Bed;

public class BedImplements1 implements Bed {
    @Override
    public void behaviour() {
        System.out.println("running bed behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running bed identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running bed state in implements");
    }
}
