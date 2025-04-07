package Assesments10;

public class IdliDetails extends Idli{
    @Override
    public void ingridients(){
        System.out.println("Rice and Urad dal");
    }
    @Override
    public void texture(){
        System.out.println("Soft and spongy");
    }
    @Override
    public void servedWith(){
        System.out.println("Sambar and chutny");
    }
    @Override
    public void preparation(){
        System.out.println("Steamed");
    }
    @Override
    public void taste(){
        System.out.println("Mild and slightly tangy");
    }
    public void addGhee(){
        System.out.println("Adding a dollop of ghee");
    }
}