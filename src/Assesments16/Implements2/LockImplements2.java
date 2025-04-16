package Assesments16.Implements2;

import Assesments16.Interfaces.Bag;
import Assesments16.Interfaces.Lock;

public class LockImplements2 implements Lock, Bag {
    @Override
    public void behaviour() {
        System.out.println("running lock behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running bag identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running lock state in implements");
    }
}
