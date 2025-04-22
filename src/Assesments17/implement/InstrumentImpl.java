package Assesments17.implement;

import Assesments17.interfacecs.Instrument;

public class InstrumentImpl implements Instrument {
    @Override
    public void playNote() {
        System.out.println("run playNote in implements");
    }
}
