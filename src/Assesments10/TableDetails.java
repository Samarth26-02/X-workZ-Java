package Assesments10;

public class TableDetails extends Table{
    @Override
    public void shape(){
        System.out.println("Rectangular");
    }
    @Override
    public void material(){
        System.out.println("Glass top,Metal legs");
    }
    @Override
    public void legsNo(){
        System.out.println("4");
    }
    @Override
    public void length(){
        System.out.println("6 feet");
    }
    @Override
    public void use(){
        System.out.println("Dining table");
    }
}
