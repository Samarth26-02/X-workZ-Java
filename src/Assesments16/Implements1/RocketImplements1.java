package Assesments16.Implements1;

import Assesments16.Interfaces.Rocket;

public class RocketImplements1 implements Rocket {
    @Override
    public void behaviour() {
        System.out.println("running rocket behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running rocket identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running rocket state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running rocket properties in implements");
    }
}
