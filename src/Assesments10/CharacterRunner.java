// CharacterRunner.java
package Assesments10;

public class CharacterRunner {
    public static void main(String[] args) {
        Character character = new Character();
        character.move();
        character.attack();
        character.defend();
        character.jump();
        character.specialAbility();

        System.out.println("----------------------");

        Character character1 = new CharacterDetails();
        character1.specialAbility();
        character1.jump();
        character1.defend();
        character1.attack();
        character1.move();

        System.out.println("----------------------");

        CharacterDetails characterDetails = new CharacterDetails();
        characterDetails.move();
        characterDetails.specialAbility();
        characterDetails.jump();
        characterDetails.defend();
        characterDetails.attack();
    }
}