package Assesments17.useclasses;

import Assesments17.interfacecs.Lawyer;

public class Court {
    Lawyer lawyer;

    public Court(Lawyer lawyer){
        this.lawyer=lawyer;
        System.out.println("run lawyer in court");
    }

    public void execute(){
        if(this.lawyer!=null){
            this.lawyer.argueCase();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
