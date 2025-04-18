package Assesments16.Implements1;

import Assesments16.Interfaces.Window;

public class WindowImplements1 implements Window {
    @Override
    public void behaviour() {
        System.out.println("running window behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running window identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running window state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running window properties in implements");
    }
}
