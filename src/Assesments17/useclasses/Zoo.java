package Assesments17.useclasses;

import Assesments17.interfacecs.WildAnimal;

public class Zoo {
    WildAnimal wildAnimal;

    public Zoo(WildAnimal wildAnimal){
        this.wildAnimal=wildAnimal;
        System.out.println("run wild animal in zoo");
    }

    public void execute(){
        if(this.wildAnimal!=null){
            this.wildAnimal.hunt();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
