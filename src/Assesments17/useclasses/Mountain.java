package Assesments17.useclasses;

import Assesments17.interfacecs.Climber;

public class Mountain {
    Climber climber;

    public Mountain(Climber climber){
        this.climber=climber;
        System.out.println("run climber in mountain");
    }

    public void execute(){
        if(this.climber!=null){
            this.climber.climb();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
