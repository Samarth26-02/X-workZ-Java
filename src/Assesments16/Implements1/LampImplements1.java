package Assesments16.Implements1;

import Assesments16.Interfaces.Lamp;

public class LampImplements1 implements Lamp {
    @Override
    public void behaviour() {
        System.out.println("running lamp behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running lamp identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running lamp state in implements");
    }
}
