package Assesments16.Implements1;

import Assesments16.Interfaces.Shirt;

public class ShirtImplements1 implements Shirt {
    @Override
    public void behaviour() {
        System.out.println("running shirt behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running shirt identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running shirt state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running shirt properties in implements");
    }
}
