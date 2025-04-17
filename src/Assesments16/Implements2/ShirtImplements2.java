package Assesments16.Implements2;

import Assesments16.Interfaces.Pant;
import Assesments16.Interfaces.Shirt;

public class ShirtImplements2 implements Shirt, Pant {
    @Override
    public void behaviour() {
        System.out.println("running shirt behaviour in implements");
    }
    @Override
    public void properties() {
        System.out.println("running properties in implements");
    }
    @Override
    public void identity() {
        System.out.println("running shirt identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running shirt state in implements");
    }
}
