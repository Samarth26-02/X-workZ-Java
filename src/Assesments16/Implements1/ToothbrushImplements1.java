package Assesments16.Implements1;

import Assesments16.Interfaces.Toothbrush;

public class ToothbrushImplements1 implements Toothbrush {
    @Override
    public void behaviour() {
        System.out.println("running tooth brush behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running tooth brush identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running tooth brush state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running tooth brush properties in implements");
    }
}
