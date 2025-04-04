package Assesments10;

public class DoorRunner {
    public static void main(String[] args) {
        Door door=new Door();
        door.color();
        door.dimension();
        door.hasHandle();
        door.material();
        door.type();
        System.out.println("------------");
        Door door1=new DoorDetails();
        door1.type();
        door1.hasHandle();
        door1.material();
        door1.color();
        door1.dimension();
        System.out.println("-------------");
        DoorDetails doorDetails=new DoorDetails();
        doorDetails.color();
        doorDetails.type();
        doorDetails.dimension();
        doorDetails.hasHandle();
        doorDetails.material();
    }
}
