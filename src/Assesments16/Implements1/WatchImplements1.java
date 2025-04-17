package Assesments16.Implements1;

import Assesments16.Interfaces.Watch;

public class WatchImplements1 implements Watch {
    @Override
    public void behaviour() {
        System.out.println("running watch behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running watch identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running watch state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running watch properties in implements");
    }
}
