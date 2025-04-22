package Assesments17.useclasses;

import Assesments17.interfacecs.Player;
import Assesments17.interfacecs.Satellite;

public class Planet {
    Satellite satellite;

    public Planet(Satellite satellite){
        this.satellite=satellite;
        System.out.println("run satellite in planet..");
    }

    public void execute(){
        if(this.satellite!=null){
            this.satellite.orbit();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
