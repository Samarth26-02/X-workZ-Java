package Assesments16.Implements1;

import Assesments16.Interfaces.Table;

public class TableImplements1 implements Table {
    @Override
    public void behaviour() {
        System.out.println("running table behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running table identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running table state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running table properties in implements");
    }
}
