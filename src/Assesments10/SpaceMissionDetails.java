package Assesments10;

public class SpaceMissionDetails extends SpaceMission{
    @Override
    public void launch(){
        System.out.println("Launch the rocket");
    }
    @Override
    public void navigate(){
        System.out.println("Navigate the mission");
    }
    @Override
    public void collectData(){
        System.out.println("Collect the data");
    }
    @Override
    public void transmitData(){
        System.out.println("Transmit data");
    }
    @Override
    public void returnToEarth(){
        System.out.println("Rocket returned to Earth");
    }
}
