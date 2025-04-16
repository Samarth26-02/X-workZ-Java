package Assesments16.Implements2;

import Assesments16.Interfaces.Bike;
import Assesments16.Interfaces.Car;

public class CarImplements2 implements Car, Bike {
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
}
