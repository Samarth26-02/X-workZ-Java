package Assesments16.Implements1;

import Assesments16.Interfaces.Spoon;

public class SpoonImplements1 implements Spoon {
    @Override
    public void behaviour() {
        System.out.println("running spoon behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running spoon identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running spoon state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running spoon properties in implements");
    }
}
