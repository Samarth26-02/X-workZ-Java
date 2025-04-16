package Assesments16.Implements1;

import Assesments16.Interfaces.Printer;

public class PrinterImplements1 implements Printer {
    @Override
    public void behaviour() {
        System.out.println("running printer behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running printer identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running printer state in implements");
    }
}
