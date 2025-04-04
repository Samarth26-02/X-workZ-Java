package Assesments10;

public class PenDetails extends Pen{
    @Override
    public void type(){
        System.out.println("Ballpoint pen");
    }
    @Override
    public void ink(){
        System.out.println("Black");
    }
    @Override
    public void material(){
        System.out.println("Plastic");
    }
    @Override
    public void retractable(){
        System.out.println("Yes");
    }
    @Override
    public void brand(){
        System.out.println("Bic");
    }
}
