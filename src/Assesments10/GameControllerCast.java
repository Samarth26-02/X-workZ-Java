package Assesments10;

public class GameControllerCast {
    public void castController(GameController controller) {
        controller.moveForward();
        controller.moveBackward();
        controller.jump();
        controller.fire();
        controller.changeWeapon();

        if (controller instanceof GameControllerDetails) {
            System.out.println("Casting to GameControllerDetails...");
            GameControllerDetails details = (GameControllerDetails) controller;
            details.specialAbility();
        }
    }
}