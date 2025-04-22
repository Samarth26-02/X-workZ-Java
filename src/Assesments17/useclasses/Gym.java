package Assesments17.useclasses;

import Assesments17.interfacecs.Trainer;

public class Gym {
    Trainer trainer;

    public Gym(Trainer trainer){
        this.trainer=trainer;
        System.out.println("run trainer in gym");
    }

    public void execute(){
        if(this.trainer!=null){
            this.trainer.train();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
