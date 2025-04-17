package Assesments16.Implements1;

import Assesments16.Interfaces.Smartphone;

public class SmartphoneImplements1 implements Smartphone {
    @Override
    public void behaviour() {
        System.out.println("running smartphone behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running smartphone identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running smartphone state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running smartphone properties in implements");
    }
}
