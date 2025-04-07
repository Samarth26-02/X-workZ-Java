// GameControllerRunner.java
package Assesments10;

public class GameControllerRunner {
    public static void main(String[] args) {
        GameController controller = new GameController();
        controller.moveForward();
        controller.moveBackward();
        controller.jump();
        controller.fire();
        controller.changeWeapon();

        System.out.println("----------------------");

        GameController controller1 = new GameControllerDetails();
        controller1.changeWeapon();
        controller1.fire();
        controller1.jump();
        controller1.moveBackward();
        controller1.moveForward();

        System.out.println("----------------------");

        GameControllerDetails controllerDetails = new GameControllerDetails();
        controllerDetails.moveForward();
        controllerDetails.changeWeapon();
        controllerDetails.fire();
        controllerDetails.jump();
        controllerDetails.moveBackward();
        controllerDetails.specialAbility();

        System.out.println("----------------------");

        GameControllerCast controllerCast = new GameControllerCast();
        controllerCast.castController(controller);
        System.out.println("----------------------");
        controllerCast.castController(controllerDetails);
    }
}