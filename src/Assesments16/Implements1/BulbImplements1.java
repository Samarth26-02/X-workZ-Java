package Assesments16.Implements1;

import Assesments16.Interfaces.Bulb;

public class BulbImplements1 implements Bulb {
    @Override
    public void behaviour() {
        System.out.println("running bulb behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running bulb identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running bulb state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running bulb properties in implements");
    }
}
