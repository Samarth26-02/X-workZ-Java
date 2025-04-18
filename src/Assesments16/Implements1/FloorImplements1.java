package Assesments16.Implements1;

import Assesments16.Interfaces.Floor;

public class FloorImplements1 implements Floor {
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
    @Override
    public void properties(){
        System.out.println("running floor properties in implements");
    }
}
