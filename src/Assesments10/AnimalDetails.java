package Assesments10;

public class AnimalDetails extends Animal{
    public AnimalDetails(){
        System.out.println("no arg constructor..");
    }
    @Override
    public void eat(){
        System.out.println("animal eating in animaldetails..");
    }
    @Override
    public void sleep(){
        System.out.println("animal sleeping in animaldetails..");
    }
    @Override
    public void sound(){
        System.out.println("animal making sound in animaldetails..");
    }

    @Override
    public void move(){
        System.out.println("animal moving in animaldetails..");
    }

    @Override
    public void fight(){
        System.out.println("animal fighting in animaldetails..");
    }
}
