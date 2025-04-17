package Assesments16.Implements1;

import Assesments16.Interfaces.Television;

public class TelevisionImplements1 implements Television {
    @Override
    public void behaviour() {
        System.out.println("running tv behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running tv identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running tv state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running tv properties in implements");
    }
}
