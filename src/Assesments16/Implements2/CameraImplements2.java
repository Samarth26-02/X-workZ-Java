package Assesments16.Implements2;

import Assesments16.Interfaces.Bulb;
import Assesments16.Interfaces.Camera;

public class CameraImplements2 implements Camera, Bulb {
    @Override
    public void behaviour() {
        System.out.println("running camera behaviour in implements");
    }

    @Override
    public void identity() {
        System.out.println("running camera identity in implements");
    }

    @Override
    public void state() {
        System.out.println("running camera state in implements");
    }
}
