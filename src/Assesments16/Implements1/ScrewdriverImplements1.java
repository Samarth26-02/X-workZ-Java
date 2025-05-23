package Assesments16.Implements1;

import Assesments16.Interfaces.Screwdriver;

public class ScrewdriverImplements1 implements Screwdriver {
    @Override
    public void behaviour() {
        System.out.println("running screwdriver behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running screwdriver identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running screwdriver state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running screwdriver properties in implements");
    }
}
