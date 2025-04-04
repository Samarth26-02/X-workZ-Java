package Assesments10;

public class ChairDetails extends Chair{
    @Override
    public void material(){
        System.out.println("Wood");
    }
    @Override
    public void type(){
        System.out.println("Office chair");
    }
    @Override
    public void hasArmrests(){
        System.out.println("Yes");
    }
    @Override
    public void color(){
        System.out.println("Gray");
    }
    @Override
    public void adjustableHeight(){
        System.out.println("Yes");
    }
}
