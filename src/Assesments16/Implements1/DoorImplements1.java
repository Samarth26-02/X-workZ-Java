package Assesments16.Implements1;

import Assesments16.Interfaces.Door;

public class DoorImplements1 implements Door {
    @Override
    public void behaviour() {
        System.out.println("running door behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running door identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running door state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running door properties in implements");
    }
}
