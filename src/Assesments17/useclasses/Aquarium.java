package Assesments17.useclasses;

import Assesments17.interfacecs.AquaticAnimal;

public class Aquarium {
    AquaticAnimal aquaticAnimal;

    public Aquarium(AquaticAnimal aquaticAnimal){
        this.aquaticAnimal=aquaticAnimal;
        System.out.println("run aquatic animal in aquarium");
    }

    public void execute(){
        if(this.aquaticAnimal!=null){
            this.aquaticAnimal.breath();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
