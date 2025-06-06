package Assesments16.Implements1;

import Assesments16.Interfaces.Pillow;

public class PillowImplements1 implements Pillow {
    @Override
    public void behaviour() {
        System.out.println("running pillow behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running pillow identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running pillow state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running pillow properties in implements");
    }
}
