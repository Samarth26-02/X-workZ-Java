package Assesments10;

public class PillowDetails extends Pillow{
    @Override
    public void material(){
        System.out.println("Down");
    }
    @Override
    public void size(){
        System.out.println("Queen");
    }
    @Override
    public void firmness(){
        System.out.println("Medium");
    }
    @Override
    public void cover(){
        System.out.println("Cotton");
    }
    @Override
    public void hypoallergenic(){
        System.out.println("Yes");
    }
}
