package Assesments10;

public class BicycleDetails extends Bicycle{
    @Override
    public void type(){
        System.out.println("Race bike");
    }
    @Override
    public void material(){
        System.out.println("Iron");
    }
    @Override
    public void gearNo(){
        System.out.println("25");
    }
    @Override
    public void brakeType(){
        System.out.println("Normal brake");
    }
    @Override
    public void color(){
        System.out.println("Blue");
    }
}
