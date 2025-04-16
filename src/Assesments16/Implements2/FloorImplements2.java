package Assesments16.Implements2;

import Assesments16.Interfaces.Floor;
import Assesments16.Interfaces.Key;

public class FloorImplements2 implements Floor, Key {
    @Override
    public void behaviour() {
        System.out.println("running floor behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running floor identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running floor state in implements");
    }
}
