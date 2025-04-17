package Assesments16.Implements2;

import Assesments16.Interfaces.Calculator;
import Assesments16.Interfaces.Microwave;

public class CalculatorImplements2 implements Calculator, Microwave {
    @Override
    public void behaviour() {
        System.out.println("running calculator behaviour in implements");
    }
    @Override
    public void properties() {
        System.out.println("running properties in implements");
    }
    @Override
    public void identity() {
        System.out.println("running calculator identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running calculator state in implements");
    }
}
