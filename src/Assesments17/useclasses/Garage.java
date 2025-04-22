package Assesments17.useclasses;

import Assesments17.interfacecs.Mechanic;

public class Garage {
    Mechanic mechanic;

    public Garage(Mechanic mechanic){
        this.mechanic=mechanic;
        System.out.println("run mechanic in garage");
    }

    public void execute(){
        if(this.mechanic!=null){
            this.mechanic.repair();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
