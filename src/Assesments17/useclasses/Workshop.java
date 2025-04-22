package Assesments17.useclasses;

import Assesments17.interfacecs.Tool;

public class Workshop {
    Tool tool;

    public Workshop(Tool tool){
        this.tool=tool;
        System.out.println("run tool in workshop");
    }

    public void execute(){
        if(this.tool!=null){
            this.tool.use();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
