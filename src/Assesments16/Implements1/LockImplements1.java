package Assesments16.Implements1;

import Assesments16.Interfaces.Lock;

public class LockImplements1 implements Lock {
    @Override
    public void behaviour() {
        System.out.println("running lock behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running lock identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running lock state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running lock properties in implements");
    }
}
