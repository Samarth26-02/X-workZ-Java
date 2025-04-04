package Assesments10;

public class TrafficLightDetails extends TrafficLight{
    @Override
    public void lightsNo(){
        System.out.println("3");
    }
    @Override
    public void shape(){
        System.out.println("Circular");
    }
    @Override
    public void mounnting(){
        System.out.println("Pole mounted");
    }
    @Override
    public void control(){
        System.out.println("Automated timer or sensor based");
    }
    @Override
    public void purpose(){
        System.out.println("Control traffic");
    }
}
