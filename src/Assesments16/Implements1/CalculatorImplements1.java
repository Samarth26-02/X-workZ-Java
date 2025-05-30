package Assesments16.Implements1;

import Assesments16.Interfaces.Calculator;

public class CalculatorImplements1 implements Calculator {
    @Override
    public void behaviour() {
        System.out.println("running calculator behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running calculator identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running calculator state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running calculator properties in implements");
    }
}
