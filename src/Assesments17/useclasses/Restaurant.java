package Assesments17.useclasses;

import Assesments17.interfacecs.Chef;

public class Restaurant {
    Chef chef;

    public Restaurant(Chef chef){
        this.chef=chef;
        System.out.println("run chef in restaurant");
    }

    public void execute(){
        if(this.chef!=null){
            this.chef.cook();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
