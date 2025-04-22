package Assesments17.useclasses;

import Assesments17.interfacecs.Peripheral;

public class Computer {
    Peripheral peripheral;

    public Computer(Peripheral peripheral){
        this.peripheral=peripheral;
        System.out.println("run peripheral in computer");
    }

    public void execute(){
        if(this.peripheral!=null){
            this.peripheral.connect();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
