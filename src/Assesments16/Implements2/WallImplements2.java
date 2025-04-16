package Assesments16.Implements2;

import Assesments16.Interfaces.Roof;
import Assesments16.Interfaces.Wall;

public class WallImplements2 implements Wall, Roof {
    @Override
    public void behaviour() {
        System.out.println("running wall behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running wall identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running wall state in implements");
    }
}
