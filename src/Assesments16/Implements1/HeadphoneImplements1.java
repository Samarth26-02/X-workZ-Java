package Assesments16.Implements1;

import Assesments16.Interfaces.Headphone;

public class HeadphoneImplements1 implements Headphone {
    @Override
    public void behaviour() {
        System.out.println("running headphone behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running headphone identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running headphone state in implements");
    }
}
