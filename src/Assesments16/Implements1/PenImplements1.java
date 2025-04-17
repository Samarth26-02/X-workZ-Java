package Assesments16.Implements1;

import Assesments16.Interfaces.Pen;

public class PenImplements1 implements Pen {
    @Override
    public void behaviour() {
        System.out.println("running pen behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running pen identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running pen state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running pen properties in implements");
    }
}
