package Assesments10;

public class PlantDetails extends Plant{
    @Override
    public void type(){
        System.out.println("Shrub");
    }
    @Override
    public void color(){
        System.out.println("Red");
    }
    @Override
    public void fragrance(){
        System.out.println("Strong");
    }
    @Override
    public void height(){
        System.out.println("3 feet");
    }
    @Override
    public void requiresSun(){
        System.out.println("Yes");
    }
}
