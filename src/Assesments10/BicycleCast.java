package Assesments10;

public class BicycleCast {
    public void castBicycle(Bicycle bicycle) {
        bicycle.type();
        bicycle.material();
        bicycle.gearNo();
        bicycle.brakeType();
        bicycle.color();

        if (bicycle instanceof BicycleDetails) {
            System.out.println("bicycle casting");
            BicycleDetails details = (BicycleDetails) bicycle;
            details.frameSize();
        }
    }
}
