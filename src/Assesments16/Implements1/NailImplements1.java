package Assesments16.Implements1;

import Assesments16.Interfaces.Nail;

public class NailImplements1 implements Nail {
    @Override
    public void behaviour() {
        System.out.println("running nail behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running nail identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running nail state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running nail properties in implements");
    }
}
