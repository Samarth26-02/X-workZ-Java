package Assesments16.Implements2;

import Assesments16.Interfaces.Carpet;
import Assesments16.Interfaces.Mirror;

public class CarpetImplements2 implements Carpet, Mirror {
    @Override
    public void behaviour() {
        System.out.println("running carpet behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running carpet identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running carpet state in implements");
    }
}
