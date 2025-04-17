package Assesments16.Implements1;

import Assesments16.Interfaces.Pant;

public class PantImplements1 implements Pant {
    @Override
    public void behaviour() {
        System.out.println("running pant behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running pant identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running pant state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running pant properties in implements");
    }
}
