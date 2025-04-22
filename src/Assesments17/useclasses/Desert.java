package Assesments17.useclasses;

import Assesments17.interfacecs.Cactus;

public class Desert {
    Cactus cactus;

    public Desert(Cactus cactus){
        this.cactus=cactus;
        System.out.println("run cactus in desert");
    }

    public void execute(){
        if(this.cactus!=null){
            this.cactus.storeWater();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
