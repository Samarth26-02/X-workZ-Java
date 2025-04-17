package Assesments16.Implements1;

import Assesments16.Interfaces.Mirror;

public class MirrorImplements1 implements Mirror {
    @Override
    public void behaviour() {
        System.out.println("running mirror behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running mirror identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running mirror state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running mirror properties in implements");
    }
}
