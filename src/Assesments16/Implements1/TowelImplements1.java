package Assesments16.Implements1;

import Assesments16.Interfaces.Towel;

public class TowelImplements1 implements Towel {
    @Override
    public void behaviour() {
        System.out.println("running towel behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running towel identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running towel state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running towel properties in implements");
    }
}
