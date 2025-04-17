package Assesments16.Implements1;

import Assesments16.Interfaces.Speaker;

public class SpeakerImplements1 implements Speaker {
    @Override
    public void behaviour() {
        System.out.println("running speaker behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running speaker identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running speaker state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running speaker properties in implements");
    }
}
