package Assesments17.useclasses;

import Assesments17.interfacecs.Document;

public class Printer {
    Document document;

    public Printer(Document document){
        this.document=document;
        System.out.println("run document in printer");
    }

    public void execute(){
        if(this.document!=null){
            this.document.print();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
