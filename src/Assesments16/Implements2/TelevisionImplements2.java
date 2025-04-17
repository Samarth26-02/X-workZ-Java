package Assesments16.Implements2;

import Assesments16.Interfaces.Fridge;
import Assesments16.Interfaces.Television;

public class TelevisionImplements2 implements Television, Fridge {
    @Override
    public void behaviour() {
        System.out.println("running tv behaviour in implements");
    }
    @Override
    public void properties() {
        System.out.println("running properties in implements");
    }
    @Override
    public void identity() {
        System.out.println("running tv identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running tv state in implements");
    }
}
