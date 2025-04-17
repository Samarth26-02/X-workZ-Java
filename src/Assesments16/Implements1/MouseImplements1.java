package Assesments16.Implements1;

import Assesments16.Interfaces.Mouse;

public class MouseImplements1 implements Mouse {
    @Override
    public void behaviour() {
        System.out.println("running mouse behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running mouse identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running mouse state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running mouse properties in implements");
    }
}
