package Assesments16.Implements1;

import Assesments16.Interfaces.Blanket;

public class BlanketImplements1 implements Blanket {
    @Override
    public void behaviour() {
        System.out.println("running blanket behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running blanket identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running blanket state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running blanket properties in implements");
    }
}
