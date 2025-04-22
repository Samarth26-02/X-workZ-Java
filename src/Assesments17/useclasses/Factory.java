package Assesments17.useclasses;

import Assesments17.interfacecs.Machine;

public class Factory {
    Machine machine;

    public Factory(Machine machine){
        this.machine=machine;
        System.out.println("run machine in factory");
    }

    public void execute(){
        if(this.machine!=null){
            this.machine.manufacture();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
