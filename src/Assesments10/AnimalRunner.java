package Assesments10;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.eat();
        animal.sound();
        animal.fight();
        animal.move();
        animal.sleep();
        System.out.println("----------------------");
        Animal animal1=new AnimalDetails();
        animal1.sleep();
        animal1.move();
        animal1.fight();
        animal1.sound();
        animal1.eat();
        System.out.println("----------------------");
        AnimalDetails animalDetails=new AnimalDetails();
        animalDetails.eat();
        animalDetails.sleep();
        animalDetails.sound();
        animalDetails.fight();
        animalDetails.move();
        System.out.println("----------------------");
        AnimalCast animalCast=new AnimalCast();
        animalCast.castAnimal(animal);
    }
}
