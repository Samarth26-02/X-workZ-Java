package Assesments16.Implements2;

import Assesments16.Interfaces.Door;
import Assesments16.Interfaces.Window;

public class DoorImplements2 implements Door, Window {
    @Override
    public void behaviour() {
        System.out.println("running door behaviour in implements");
    }
    @Override
    public void properties() {
        System.out.println("running properties in implements");
    }
    @Override
    public void identity() {
        System.out.println("running door identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running door state in implements");
    }
}
