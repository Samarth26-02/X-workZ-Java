package Assesments16.Implements1;

import Assesments16.Interfaces.Car;

public class CarImplements1 implements Car {
    @Override
    public void behaviour() {
        System.out.println("running car behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running car identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running car state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running car properties in implements");
    }
}
