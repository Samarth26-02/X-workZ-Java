package Assesments10;

public class MetroCardDetails extends MetroCard{
    @Override
    public void material(){
        System.out.println("Plastic");
    }
    @Override
    public void color(){
        System.out.println("Blue or green");
    }
    @Override
    public void functionality(){
        System.out.println("Stores monetary value for travel");
    }
    @Override
    public void validity(){
        System.out.println("Long term");
    }
    @Override
    public void issuingAuthority(){
        System.out.println("BMRCL");
    }
}
