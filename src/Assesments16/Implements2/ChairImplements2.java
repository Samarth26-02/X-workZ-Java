package Assesments16.Implements2;

import Assesments16.Interfaces.Chair;
import Assesments16.Interfaces.Table;

public class ChairImplements2 implements Chair, Table {
    @Override
    public void behaviour() {
        System.out.println("running chair behaviour in implements");
    }
    @Override
    public void properties() {
        System.out.println("running properties in implements");
    }
    @Override
    public void identity() {
        System.out.println("running chair identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running chair state in implements");
    }
}
