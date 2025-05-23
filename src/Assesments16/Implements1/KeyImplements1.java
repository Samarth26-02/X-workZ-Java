package Assesments16.Implements1;

import Assesments16.Interfaces.Key;

public class KeyImplements1 implements Key {
    @Override
    public void behaviour() {
        System.out.println("running key behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running key identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running key state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running key properties in implements");
    }
}
