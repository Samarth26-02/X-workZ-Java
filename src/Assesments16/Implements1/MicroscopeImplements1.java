package Assesments16.Implements1;

import Assesments16.Interfaces.Microscope;

public class MicroscopeImplements1 implements Microscope {
    @Override
    public void behaviour() {
        System.out.println("running microscope behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running microscope identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running microscope state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running microscope properties in implements");
    }
}
