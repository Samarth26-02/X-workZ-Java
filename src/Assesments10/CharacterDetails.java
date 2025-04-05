// CharacterDetails.java
package Assesments10;

public class CharacterDetails extends Character {
    @Override
    public void move() {
        System.out.println("Character is moving with detail");
    }

    @Override
    public void attack() {
        System.out.println("Character is performing detailed attack");
    }

    @Override
    public void defend() {
        System.out.println("Character is performing detailed defense");
    }

    @Override
    public void jump() {
        System.out.println("Character is performing detailed jump");
    }

    @Override
    public void specialAbility() {
        System.out.println("Character uses detailed special ability");
    }
}