package Assesments10;

public class RefrigeratorDetails extends Refrigerator{
    @Override
    public void type(){
        System.out.println("French door");
    }
    @Override
    public void color(){
        System.out.println("Stainless steel");
    }
    @Override
    public void freezer(){
        System.out.println("Bottom");
    }
    @Override
    public void capacity(){
        System.out.println("25 cubic feet");
    }
    @Override
    public void energyStar(){
        System.out.println("Yes");
    }
}
