package Assesments16.Implements1;

import Assesments16.Interfaces.Toothpaste;

public class ToothpasteImplements1 implements Toothpaste {
    @Override
    public void behaviour() {
        System.out.println("running tooth paste behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running tooth paste identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running tooth paste state in implements");
    }
}
