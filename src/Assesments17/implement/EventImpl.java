package Assesments17.implement;

import Assesments17.interfacecs.Event;

public class EventImpl implements Event {
    @Override
    public void celebrate() {
        System.out.println("run celebrate in implements");
    }
}
