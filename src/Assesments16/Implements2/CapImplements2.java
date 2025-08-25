//assesment16

package Assesments16.Implements2;

import Assesments16.Interfaces.Cap;
import Assesments16.Interfaces.Helmet;

public class CapImplements2 implements Cap, Helmet {
    @Override
    public void behaviour() {
        System.out.println("running cap behaviour in implements");
    }
    @Override
    public void properties() {
        System.out.println("running properties in implements");
    }
    @Override
    public void identity() {
        System.out.println("running cap identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running cap state in implements");
    }
}
