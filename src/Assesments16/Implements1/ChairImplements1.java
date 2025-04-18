package Assesments16.Implements1;

import Assesments16.Interfaces.Chair;

public class ChairImplements1 implements Chair {
    @Override
    public void behaviour() {
        System.out.println("running chair behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running chair identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running chair state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running chair properties in implements");
    }
}
