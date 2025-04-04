package Assesments10;

public class PersonDetails extends Person{
    @Override
    public void walk(){
        System.out.println("Person walks");
    }
    @Override
    public void talk(){
        System.out.println("Person talks");
    }
    @Override
    public void eat(){
        System.out.println("Person eats");
    }
    @Override
    public void sleep(){
        System.out.println("Person sleeps");
    }
    @Override
    public void wake(){
        System.out.println("Person wakes");
    }
}
