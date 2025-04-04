package Assesments10;

public class SpaceMissionRunner {
    public static void main(String[] args) {
        SpaceMission spaceMission=new SpaceMission();
        spaceMission.launch();
        spaceMission.navigate();
        spaceMission.collectData();
        spaceMission.transmitData();
        spaceMission.returnToEarth();
        System.out.println("-------------");
        SpaceMission spaceMission1=new SpaceMissionDetails();
        spaceMission1.launch();
        spaceMission1.navigate();
        spaceMission1.collectData();
        spaceMission1.transmitData();
        spaceMission1.returnToEarth();
        System.out.println("-------------");
        SpaceMissionDetails spaceMissionDetails=new SpaceMissionDetails();
        spaceMissionDetails.collectData();
        spaceMissionDetails.launch();
        spaceMissionDetails.navigate();
        spaceMissionDetails.returnToEarth();
        spaceMissionDetails.transmitData();
    }
}
