package Assesments16.Implements1;

import Assesments16.Interfaces.Oven;

public class OvenImplements1 implements Oven {
    @Override
    public void behaviour() {
        System.out.println("running oven behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running oven identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running oven state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running oven properties in implements");
    }
}
