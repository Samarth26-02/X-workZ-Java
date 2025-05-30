package Assesments16.Implements1;

import Assesments16.Interfaces.Curtain;

public class CurtainImplements1 implements Curtain {
    @Override
    public void behaviour() {
        System.out.println("running curtain behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running curtain identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running curtain state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running curtain properties in implements");
    }
}
