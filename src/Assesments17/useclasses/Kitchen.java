package Assesments17.useclasses;

import Assesments17.interfacecs.Appliance;

public class Kitchen {
    Appliance appliance;

    public Kitchen(Appliance appliance){
        this.appliance=appliance;
        System.out.println("run appliances in kitchen..");
    }

    public void execute(){
        if(this.appliance!=null){
            this.appliance.operate();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
