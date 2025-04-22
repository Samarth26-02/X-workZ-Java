package Assesments17.useclasses;

import Assesments17.interfacecs.Productline;

public class Industry {
    Productline productline;

    public Industry(Productline productline){
        this.productline=productline;
        System.out.println("run product line in industry");
    }

    public void execute(){
        if(this.productline!=null){
            this.productline.produce();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
