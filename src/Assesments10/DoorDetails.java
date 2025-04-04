package Assesments10;

public class DoorDetails extends Door{
    @Override
    public void material(){
        System.out.println("Wood");
    }
    @Override
    public void type(){
        System.out.println("Interior door");
    }
    @Override
    public void color(){
        System.out.println("White");
    }
    @Override
    public void hasHandle(){
        System.out.println("Yes");
    }
    @Override
    public void dimension(){
        System.out.println("30 inches X 80 inches");
    }
}
