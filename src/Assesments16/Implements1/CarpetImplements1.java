package Assesments16.Implements1;

import Assesments16.Interfaces.Carpet;

public class CarpetImplements1 implements Carpet {
    @Override
    public void behaviour() {
        System.out.println("running carpet behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running carpet identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running carpet state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running carpet properties in implements");
    }
}
