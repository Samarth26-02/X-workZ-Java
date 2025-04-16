package Assesments16.Implements2;

import Assesments16.Interfaces.Cup;
import Assesments16.Interfaces.Glass;

public class CupImplements2 implements Cup, Glass {
    @Override
    public void behaviour() {
        System.out.println("running cup behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running cup identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running cup state in implements");
    }
}
