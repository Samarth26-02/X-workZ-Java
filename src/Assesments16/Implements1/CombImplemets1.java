package Assesments16.Implements1;

import Assesments16.Interfaces.Comb;

public class CombImplemets1 implements Comb {
    @Override
    public void behaviour() {
        System.out.println("running comb behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running comb identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running comb state in implements");
    }
    @Override
    public void properties(){
        System.out.println("running comb properties in implements");
    }
}
