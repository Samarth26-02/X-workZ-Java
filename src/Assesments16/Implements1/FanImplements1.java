package Assesments16.Implements1;

import Assesments16.Interfaces.Fan;

public class FanImplements1 implements Fan {
    @Override
    public void behaviour() {
        System.out.println("running fan behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running fan identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running fan state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running fan properties in implements");
    }
}
