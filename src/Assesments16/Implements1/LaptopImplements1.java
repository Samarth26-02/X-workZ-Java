package Assesments16.Implements1;

import Assesments16.Interfaces.Laptop;

public class LaptopImplements1 implements Laptop {
    @Override
    public void behaviour() {
        System.out.println("running laptop behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running laptop identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running laptop state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running laptop properties in implements");
    }
}
