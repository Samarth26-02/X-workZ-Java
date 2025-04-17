package Assesments16.Implements1;

import Assesments16.Interfaces.Cup;

public class CupImplements1 implements Cup {
    @Override
    public void behaviour() {
        System.out.println("running cup behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running cup identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running cup state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running cup properties in implements");
    }
}
