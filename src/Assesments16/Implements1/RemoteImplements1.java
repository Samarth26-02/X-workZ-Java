package Assesments16.Implements1;

import Assesments16.Interfaces.Remote;

public class RemoteImplements1 implements Remote {
    @Override
    public void behaviour() {
        System.out.println("running remote behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running remote identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running remote state in implements");
    }
}
