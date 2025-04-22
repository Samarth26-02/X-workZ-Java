package Assesments17.useclasses;

import Assesments17.interfacecs.Performer;

public class Theater {
    Performer performer;

    public Theater(Performer performer){
        this.performer=performer;
        System.out.println("run performer in theater");
    }

    public void execute(){
        if(this.performer!=null){
            this.performer.perform();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
