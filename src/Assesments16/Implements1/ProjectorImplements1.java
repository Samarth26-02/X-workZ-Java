package Assesments16.Implements1;

import Assesments16.Interfaces.Projector;

public class ProjectorImplements1 implements Projector {
    @Override
    public void behaviour() {
        System.out.println("running projector behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running projector identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running projector state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running projector properties in implements");
    }
}
