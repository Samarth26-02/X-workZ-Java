package Assesments17.useclasses;

import Assesments17.interfacecs.Event;

public class Festival {
    Event event;

    public Festival(Event event){
        this.event=event;
        System.out.println("run event in festival");
    }

    public void execute(){
        if(this.event!=null){
            this.event.celebrate();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
