package Assesments17.useclasses;

import Assesments17.interfacecs.Laptop;

public class OperatingSystem {
    Laptop laptop;

    public OperatingSystem(Laptop laptop){
        this.laptop=laptop;
        System.out.println("run laptop in usage..");
    }

    public void execute(){
        if(this.laptop!=null){
            this.laptop.process();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
