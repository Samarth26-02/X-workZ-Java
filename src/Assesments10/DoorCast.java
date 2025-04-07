package Assesments10;

public class DoorCast {
    public void castDoor(Door door) {
        door.material();
        door.type();
        door.color();
        door.hasHandle();
        door.dimension();

        if (door instanceof DoorDetails) {
            System.out.println("Casting to DoorDetails...");
            DoorDetails details = (DoorDetails) door;
            details.lockType();
        }
    }
}
