package Assesments16.Implements2;

import Assesments16.Interfaces.Shoe;
import Assesments16.Interfaces.Socks;

public class ShoeImplements2 implements Shoe, Socks {
    @Override
    public void behaviour() {
        System.out.println("running shoe behaviour in implements");
    }
    @Override
    public void properties() {
        System.out.println("running properties in implements");
    }
    @Override
    public void identity() {
        System.out.println("running shoe identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running shoe state in implements");
    }
}
