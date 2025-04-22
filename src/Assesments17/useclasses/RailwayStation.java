package Assesments17.useclasses;

import Assesments17.interfacecs.Train;

public class RailwayStation {
    Train train;

    public RailwayStation(Train train){
        this.train=train;
        System.out.println("run train in railway station");
    }

    public void execute(){
        if(this.train!=null){
            this.train.depart();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
