//assesment 16

package Assesments16.Implements5;

import Assesments16.Interfaces.*;

public class FridgeImplements5 implements Fridge, Car, Bike, Bus, Train {
    @Override
    public void behaviour() {
        System.out.println("running  behaviour in implements");
    }
    @Override
    public void properties() {
        System.out.println("running properties in implements");
    }
    @Override
    public void identity() {
        System.out.println("running  identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running  state in implements");
    }
}
