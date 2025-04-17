package Assesments16.Implements2;

import Assesments16.Interfaces.Oven;
import Assesments16.Interfaces.WasshingMachine;

public class WashingMachineImplements2 implements WasshingMachine, Oven {
    @Override
    public void behaviour() {
        System.out.println("running oven behaviour in implements");
    }
    @Override
    public void properties() {
        System.out.println("running properties in implements");
    }
    @Override
    public void identity() {
        System.out.println("running oven identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running oven state in implements");
    }
}
