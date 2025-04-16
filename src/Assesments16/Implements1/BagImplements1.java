package Assesments16.Implements1;

import Assesments16.Interfaces.Bag;

public class BagImplements1 implements Bag {
    @Override
    public void behaviour() {
        System.out.println("running bag behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running bag identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running bag state in implements");
    }
}
