package Assesments16.Implements1;

import Assesments16.Interfaces.Microwave;

public class MicrowaveImplements1 implements Microwave {
    @Override
    public void behaviour() {
        System.out.println("running microwave behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running microwave identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running microwave state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running microwave properties in implements");
    }
}
