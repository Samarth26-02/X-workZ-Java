package Assesments16.Implements1;

import Assesments16.Interfaces.Bottle;

public class BottleImplements1 implements Bottle {
    @Override
    public void behaviour() {
        System.out.println("running bottle behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running bottle identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running bottle state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running bottle properties in implements");
    }
}
