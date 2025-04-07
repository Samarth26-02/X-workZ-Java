package Assesments10;

public class GuitarDetails extends Guitar{
    @Override
    public void type(){
        System.out.println("Acoustic Guitar");
    }
    @Override
    public void material(){
        System.out.println("Mahogany");
    }
    @Override
    public void strings(){
        System.out.println("6");
    }
    @Override
    public void color(){
        System.out.println("Natural");
    }
    @Override
    public void brand(){
        System.out.println("Fender");
    }
    public void play(){
        System.out.println("Playing the guitar");
    }
}