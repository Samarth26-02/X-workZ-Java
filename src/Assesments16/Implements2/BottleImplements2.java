package Assesments16.Implements2;

import Assesments16.Interfaces.Bottle;
import Assesments16.Interfaces.Fan;

public class BottleImplements2 implements Bottle, Fan {
    @Override
    public void behaviour() {
        System.out.println("running bottle behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running bottle identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running bottle state in implements");
    }
}
