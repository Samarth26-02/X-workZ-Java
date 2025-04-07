package Assesments10;

public class LaptopDetails extends Laptop{
    @Override
    public void brand(){
        System.out.println("Dell");
    }
    @Override
    public void model(){
        System.out.println("XPS 15");
    }
    @Override
    public void processor(){
        System.out.println("Intel core i9");
    }
    @Override
    public void ram(){
        System.out.println("32 GB");
    }
    @Override
    public void storage(){
        System.out.println("512 GB");
    }
    public void displayOS(){
        System.out.println("Windows 11");
    }
}