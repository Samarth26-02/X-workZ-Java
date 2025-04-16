package Assesments16.Implements1;

import Assesments16.Interfaces.Vehicle;

public class VehicleImplements1 implements Vehicle {
    @Override
    public void behaviour() {
        System.out.println("running vehicle behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running vehicle identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running vehicle state in implements");
    }
}
