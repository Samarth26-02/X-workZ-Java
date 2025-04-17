package Assesments16.Implements2;

import Assesments16.Interfaces.Headphone;
import Assesments16.Interfaces.Speaker;

public class SpeakerImplements2 implements Speaker, Headphone {
    @Override
    public void behaviour() {
        System.out.println("running speaker behaviour in implements");
    }
    @Override
    public void properties() {
        System.out.println("running properties in implements");
    }
    @Override
    public void identity() {
        System.out.println("running speaker identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running speaker state in implements");
    }
}
