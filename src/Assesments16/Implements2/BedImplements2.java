package Assesments16.Implements2;

import Assesments16.Interfaces.Bed;
import Assesments16.Interfaces.Sofa;

public class BedImplements2 implements Bed, Sofa {
    @Override
    public void behaviour() {
        System.out.println("running bed behaviour in implements");
    }
    @Override
    public void properties() {
        System.out.println("running properties in implements");
    }
    @Override
    public void identity() {
        System.out.println("running bed identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running bed state in implements");
    }
}
