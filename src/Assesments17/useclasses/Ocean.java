package Assesments17.useclasses;

import Assesments17.interfacecs.Fish;

public class Ocean {
    Fish fish;

    public Ocean(Fish fish){
        this.fish=fish;
        System.out.println("run fish in ocean");
    }

    public void execute(){
        if(this.fish!=null){
            this.fish.swim();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
