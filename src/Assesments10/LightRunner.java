package Assesments10;

public class LightRunner {
    public static void main(String[] args) {
        Light light = new Light();
        light.turnOn();
        light.turnOff();
        light.dim();
        light.brighten();
        light.setColor();

        System.out.println("----------------------");

        Light light1 = new LightDetails();
        light1.setColor();
        light1.brighten();
        light1.dim();
        light1.turnOff();
        light1.turnOn();

        System.out.println("----------------------");

        LightDetails lightDetails = new LightDetails();
        lightDetails.turnOn();
        lightDetails.setColor();
        lightDetails.brighten();
        lightDetails.dim();
        lightDetails.turnOff();
    }
}
