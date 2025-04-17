package Assesments16.Implements2;

import Assesments16.Interfaces.Laptop;
import Assesments16.Interfaces.Smartphone;

public class LaptopImplements2 implements Laptop, Smartphone {
    @Override
    public void behaviour() {
        System.out.println("running laptop behaviour in implements");
    }
    @Override
    public void properties() {
        System.out.println("running properties in implements");
    }
    @Override
    public void identity() {
        System.out.println("running laptop identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running laptop state in implements");
    }
}
