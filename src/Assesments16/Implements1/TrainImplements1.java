package Assesments16.Implements1;

import Assesments16.Interfaces.Train;

public class TrainImplements1 implements Train {
    @Override
    public void behaviour() {
        System.out.println("running train behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running train identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running train state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running train properties in implements");
    }
}
