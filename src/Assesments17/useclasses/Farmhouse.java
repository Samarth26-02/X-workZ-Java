package Assesments17.useclasses;

import Assesments17.interfacecs.Pet;

public class Farmhouse {
    Pet pet;

    public Farmhouse(Pet pet){
        this.pet=pet;
        System.out.println("run pet in farm house");
    }

    public void execute(){
        if(this.pet!=null){
            this.pet.feed();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
