package Assesments16.Implements2;

import Assesments16.Interfaces.Airplane;
import Assesments16.Interfaces.Ship;

public class AirplaneImplements2 implements Airplane, Ship {
    @Override
    public void behaviour() {
        System.out.println("running Airplane behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running airplane identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running airplane state in implements");
    }
}
