// GameControllerDetails.java
package Assesments10;

public class GameControllerDetails extends GameController {
    @Override
    public void moveForward() {
        System.out.println("Moving forward with precision");
    }

    @Override
    public void moveBackward() {
        System.out.println("Moving backward with precision");
    }

    @Override
    public void jump() {
        System.out.println("Performing a detailed jump");
    }

    @Override
    public void fire() {
        System.out.println("Firing weapon with burst mode");
    }

    @Override
    public void changeWeapon() {
        System.out.println("Changing to a specific weapon");
    }

    public void specialAbility() {
        System.out.println("Activating special ability");
    }
}