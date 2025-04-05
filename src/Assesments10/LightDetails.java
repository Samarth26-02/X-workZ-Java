package Assesments10;

public class LightDetails extends Light{
    @Override
    public void turnOn() {
        System.out.println("Turning detailed light on");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning detailed light off");
    }

    @Override
    public void dim() {
        System.out.println("Dimming detailed light");
    }

    @Override
    public void brighten() {
        System.out.println("Brightening detailed light");
    }

    @Override
    public void setColor() {
        System.out.println("Setting detailed light color");
    }
}
