package Assesments16.Implements1;

import Assesments16.Interfaces.Keyboard;

public class KeyboardImplements1 implements Keyboard {
    @Override
    public void behaviour() {
        System.out.println("running keyboard behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running keyboard identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running keyboard state in implements");
    }
}
