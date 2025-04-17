package Assesments16.Implements2;

import Assesments16.Interfaces.Blanket;
import Assesments16.Interfaces.Pillow;

public class PillowImplements2 implements Pillow, Blanket {
    @Override
    public void behaviour() {
        System.out.println("running pillow behaviour in implements");
    }
    @Override
    public void properties() {
        System.out.println("running properties in implements");
    }
    @Override
    public void identity() {
        System.out.println("running pillow identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running pillow state in implements");
    }
}
