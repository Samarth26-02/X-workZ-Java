package Assesments16.Implements1;

import Assesments16.Interfaces.Socks;

public class SocksImplements1 implements Socks {
    @Override
    public void behaviour() {
        System.out.println("running socks behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running socks identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running socks state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running socks properties in implements");
    }
}
