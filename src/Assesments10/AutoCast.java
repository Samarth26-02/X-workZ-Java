package Assesments10;

public class AutoCast {
    public void castAuto(Auto auto){
        auto.color();
        auto.fuel();
        auto.capacity();
        auto.meter();
        auto.wheels();
        if(auto instanceof AutoDetails){
            System.out.println("auto casting");
            AutoDetails autoDetails=(AutoDetails)auto;
            autoDetails.distance();
        }
    }
}
