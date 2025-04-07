package Assesments10;

public class AnimalCast {
    public void castAnimal(Animal animal){
        animal.eat();
        animal.fight();
        animal.sound();
        animal.move();
        animal.sleep();
        if(animal instanceof AnimalDetails){
            System.out.println("casting animal");
            AnimalDetails animalDetails=(AnimalDetails)animal;
            animalDetails.roar();
        }
    }
}
