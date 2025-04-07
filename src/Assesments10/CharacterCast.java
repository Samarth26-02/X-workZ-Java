package Assesments10;

public class CharacterCast {
    public void castCharacter(Character character) {
        character.move();
        character.attack();
        character.defend();
        character.jump();
        character.specialAbility();

        if (character instanceof CharacterDetails) {
            System.out.println("character casting");
            CharacterDetails characterDetails = (CharacterDetails) character;
            characterDetails.transformation();
        }
    }
}
