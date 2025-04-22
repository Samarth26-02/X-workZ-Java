package Assesments17.useclasses;

import Assesments17.interfacecs.Ride;

public class Park {
    Ride ride;

    public Park(Ride ride){
        this.ride=ride;
        System.out.println("run ride in park");
    }

    public void execute(){
        if(this.ride!=null){
            this.ride.startRide();
        }
        else{
            System.out.println("null value, can not print..");
        }
    }
}
